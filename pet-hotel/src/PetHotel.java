import java.util.*;

public class PetHotel {
    final int hotelCapacity = 10;
    private int currentNoAnimals = 0;
    private ArrayList<Client> listOfClients = new ArrayList<>();
    private ArrayList<Animal> listOfAnimals = new ArrayList<>();
    private ArrayList<Receipt> listOfReceipts = new ArrayList<>();
    private HashMap<Receipt, Animal> animalsRecord = new HashMap<>();
    private HashSet<String> arrivalDates = new HashSet<>();
    private LinkedList<Receipt> waitingListReceipts = new LinkedList<>();

    public void populateObjects() {
        Client client01 = new Client("Pop George", "Chupi");
        listOfClients.add(client01);
        Client client02 = new Client("Georgescu Adriana", "Paloma");
        listOfClients.add(client02);
        Client client03 = new Client("Avramescu Georgiana", "Nero");
        listOfClients.add(client03);
        Client client04 = new Client("Banica Alex", "Sisi");
        listOfClients.add(client04);
        Client client05 = new Client("Somesan Maria", "Pixie");
        listOfClients.add(client05);
        Client client06 = new Client("Marcu Marius", "Greedy");
        listOfClients.add(client06);
        Client client07 = new Client("Pop Andrei", "Lola");
        listOfClients.add(client07);
        Client client08 = new Client("Georgescu Andreea", "Zola");
        listOfClients.add(client08);
        Client client09 = new Client("Avramescu Cristian", "Frodo");
        listOfClients.add(client09);
        Client client10 = new Client("Banica Alexandra", "Pixel");
        listOfClients.add(client10);
        Client client11 = new Client("Somesan Cosmina", "Dixie");
        listOfClients.add(client11);
        Client client12 = new Client("Marcu Antonia", "Suzi");
        listOfClients.add(client12);

        Animal animal01 = new Dog("Chupi", 1, "09-12-2021", "12-12-2021", "australian shepherd", true);
        addDate(animal01);
        Animal animal02 = new Dog("Paloma", 2, "09-12-2021", "12-12-2021", "golden retriever", false);
        addDate(animal02);
        Animal animal03 = new Dog("Nero", 3, "10-12-2021", "15-12-2021", "akita", true);
        addDate(animal03);
        Animal animal04 = new Cat("Sisi", 4, "10-12-2021", "15-12-2021", "junior");
        addDate(animal04);
        Animal animal05 = new Cat("Pixie", 5, "11-12-2021", "18-12-2021", "adult");
        addDate(animal05);
        Animal animal06 = new Cat("Greedy", 6, "11-12-2021", "18-12-2021", "junior");
        addDate(animal06);
        Animal animal07 = new Dog("Lola", 7, "12-12-2021", "16-12-2021", "australian shepherd", false);
        addDate(animal07);
        Animal animal08 = new Dog("Zola", 8, "12-12-2021", "16-12-2021", "golden retriever", false);
        addDate(animal08);
        Animal animal09 = new Dog("Frodo", 9, "13-12-2021", "20-12-2021", "akita", true);
        addDate(animal09);
        Animal animal10 = new Cat("Pixel", 10, "13-12-2021", "20-12-2021", "adult");
        addDate(animal10);
        Animal animal11 = new Cat("Dixie", 11, "14-12-2021", "19-12-2021", "adult");
        addDate(animal11);
        Animal animal12 = new Cat("Suzi", 12, "14-12-2021", "19-12-2021", "junior");
        addDate(animal12);

        Receipt receipt01 = new Receipt("Pop George", "12-12-2021", 150);
        listOfReceipts.add(receipt01);
        Receipt receipt02 = new Receipt("Georgescu Adriana", "12-12-2021", 150);
        listOfReceipts.add(receipt02);
        Receipt receipt03 = new Receipt("Avramescu Georgiana", "15-12-2021", 250);
        listOfReceipts.add(receipt03);
        Receipt receipt04 = new Receipt("Banica Alex", "15-12-2021", 250);
        listOfReceipts.add(receipt04);
        Receipt receipt05 = new Receipt("Somesan Maria", "18-12-2021", 350);
        listOfReceipts.add(receipt05);
        Receipt receipt06 = new Receipt("Marcu Marius", "18-12-2021", 350);
        listOfReceipts.add(receipt06);
        Receipt receipt07 = new Receipt("Pop Andrei", "16-12-2021", 200);
        listOfReceipts.add(receipt07);
        Receipt receipt08 = new Receipt("Georgescu Andreea", "16-12-2021", 200);
        listOfReceipts.add(receipt08);
        Receipt receipt09 = new Receipt("Avramescu Cristian", "20-12-2021", 350);
        listOfReceipts.add(receipt09);
        Receipt receipt10 = new Receipt("Banica Alexandra", "20-12-2021", 350);
        listOfReceipts.add(receipt10);
        Receipt receipt11 = new Receipt("Somesan Cosmina", "19-12-2021", 250);
        listOfReceipts.add(receipt11);
        Receipt receipt12 = new Receipt("Marcu Antonia", "19-12-2021", 40);
        listOfReceipts.add(receipt12);

        addAnimal(receipt01, animal01);
        addAnimal(receipt02, animal02);
        addAnimal(receipt03, animal03);
        addAnimal(receipt04, animal04);
        addAnimal(receipt05, animal05);
        addAnimal(receipt06, animal06);
        addAnimal(receipt07, animal07);
        addAnimal(receipt08, animal08);
        addAnimal(receipt09, animal09);
        addAnimal(receipt10, animal10);
        addAnimal(receipt11, animal11);
        addAnimal(receipt12, animal12);
    }

    public void addDate(Animal animal) {
        arrivalDates.add(animal.getArrivalDate());
    }

    public void displayAnimalByDates() {
        for (String date :
                arrivalDates) {
            System.out.println("In " + date + " were accommodated : ");
            int count = 0;

            for (Animal animal :
                    listOfAnimals) {
                if (date.equals(animal.getArrivalDate())) {
                    System.out.println(animal.getPetName());
                    count += 1;
                }
            }

            if (count == 0)
                System.out.println("no animal has been accommodated in this date");
        }
    }

    public void addAnimal(Receipt receipt, Animal animal) {
        if (currentNoAnimals + 1 <= hotelCapacity) {
            animalsRecord.put(receipt, animal);
            listOfAnimals.add(animal);
            currentNoAnimals += 1;
        } else {
            waitingListReceipts.addLast(receipt);
        }
    }

    public void displayReceipts() {
        for (Map.Entry entry :
                animalsRecord.entrySet()) {
            for (Receipt receipt :
                    listOfReceipts) {
                if (entry.getKey().equals(receipt))
                    if (receipt.getPrice() > 200)
                        System.out.println("Key : " + entry.getKey() + "    " + "Value : " + entry.getValue());
            }
        }
    }

    public void simulateCatsPlaying() {
        for (Animal animal :
                listOfAnimals) {
            if (animal instanceof Cat)
                if (((Cat) animal).getAge().equals("junior"))
                    ((Cat) animal).play();
        }
    }

    public void simulateDogsTraining() {
        for (Animal animal :
                listOfAnimals) {
            if (animal instanceof Dog)
                if (!((Dog) animal).needsDailyWalk())
                    ((Dog) animal).train();
        }
    }

    public void displayWaitingList() {
        for (Receipt receipt :
                waitingListReceipts) {
            for (Client client :
                    listOfClients) {
                if (receipt.getClientName().equals(client.getFullName()))
                    System.out.println("Receipt : " + receipt + " Client : " + client);
            }
        }
    }

    public void deleteFromWaitingList() {
        for (int i = 0; i < waitingListReceipts.size(); i++) {
            if (waitingListReceipts.get(i).getPrice() < 50) {
                waitingListReceipts.remove(i);
                i -= 1;
            }
        }
    }
}
