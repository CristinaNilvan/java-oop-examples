public class GroceryList {
    private final String[] items = new String[20];
    private int numberOfItems;

    public GroceryList() {
        numberOfItems = 0;
    }

    public void insertItem(String item) {
        items[numberOfItems] = item;
        numberOfItems += 1;
    }

    public void printList(){
        System.out.println("My list has : ");

        for (int i = 0; i < numberOfItems; i++) {
            System.out.println(items[i]);
        }
    }
}
