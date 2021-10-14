public class Main {

    public static void main(String[] args) {
        LotteryApp lottery = new LotteryApp(6, 49);

        double winningChances = lottery.calculateWinningChances();
        System.out.println("Winning chances : " + winningChances);

        System.out.println("The extracted numbers are : ");
        lottery.extractNumbers();

    }
}
