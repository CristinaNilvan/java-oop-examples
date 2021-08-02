public class Main {
    public static void main(String[] args) {
        GroceryList myList = new GroceryList();

        myList.insertItem("tomatoes");
        myList.insertItem("chocolate");
        myList.insertItem("ice-cream");
        myList.insertItem("cheese");

        myList.printList();
    }
}
