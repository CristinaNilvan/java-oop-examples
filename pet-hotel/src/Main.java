public class Main {
    public static void main(String[] args) {
        PetHotel myHotel = new PetHotel();
        myHotel.populateObjects();

        System.out.println("List of animals by their arrival date : ");
        myHotel.displayAnimalByDates();
        System.out.println();

        System.out.println("Receipts over 200 lei : ");
        myHotel.displayReceipts();
        System.out.println();

        myHotel.simulateCatsPlaying();
        System.out.println();

        myHotel.simulateDogsTraining();
        System.out.println();

        System.out.println("Current waiting list : ");
        myHotel.displayWaitingList();
        System.out.println();

        System.out.println("The waiting list after the deletion of receipts less than 50 lei : ");
        myHotel.deleteFromWaitingList();
        myHotel.displayWaitingList();
        System.out.println();
    }
}
