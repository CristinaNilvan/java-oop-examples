public class Main {

    public static void main(String[] args) {
        LotteryApp lottery = new LotteryApp(6, 49);

        int probability = lottery.calculateProbability();
        System.out.println("Winning chances are 1 in " + probability);

        System.out.println("The extracted numbers are : ");
        int numberOfDraws = lottery.getNumberOfDraws();
        UsedFunctions.printArray(lottery.extractNumbers(), numberOfDraws);
    }
}
