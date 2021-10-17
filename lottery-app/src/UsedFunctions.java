import java.math.BigInteger;

public class UsedFunctions {

    public static BigInteger factorial(int number) {
        BigInteger fact = BigInteger.ONE;

        for (int i = 1; i <= number; i++)
            fact = fact.multiply(BigInteger.valueOf(i));

        return fact;
    }

    public static void printArray(int[] array, int n) {
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
    }
}
