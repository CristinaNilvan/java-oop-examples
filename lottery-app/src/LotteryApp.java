import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class LotteryApp {
    private final int numberOfDraws;
    private final int totalPossibilities;

    LotteryApp(int numberOfDraws, int totalPossibilities) {
        this.numberOfDraws = numberOfDraws;
        this.totalPossibilities = totalPossibilities;
    }

    public int calculateProbability() {
        BigInteger factNumberOfDraws = UsedFunctions.factorial(numberOfDraws);
        BigInteger factTotalPossibilities = UsedFunctions.factorial(totalPossibilities);

        int subtraction = totalPossibilities - numberOfDraws;
        BigInteger factSubtraction = UsedFunctions.factorial(subtraction);

        BigInteger bigIntDenominator = factNumberOfDraws.multiply(factSubtraction);

        return factTotalPossibilities.divide(bigIntDenominator).intValue();
    }


    public void extractNumbers() {
        var extractedNumbers = new int[6];

        for (int i = 0; i < numberOfDraws; i++) {
            extractedNumbers[i] = (int)(Math.random() * ((totalPossibilities - 1) + 1)) + 1;

            for (int j = 0; j < i; j++)
                if (extractedNumbers[i] == extractedNumbers[j])
                    extractedNumbers[j] = (int)(Math.random() * ((totalPossibilities - 1) + 1)) + 1;

        }

        UsedFunctions.printArray(extractedNumbers);
    }
}
