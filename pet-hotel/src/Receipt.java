public class Receipt {
    protected String clientName;
    protected String returnDate;
    protected int price;

    public Receipt(String clientName, String returnDate, int price) {
        this.clientName = clientName;
        this.returnDate = returnDate;
        this.price = price;
    }

    public String getClientName() {
        return clientName;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "clientName='" + clientName + '\'' +
                ", returnDate='" + returnDate + '\'' +
                ", price=" + price +
                '}';
    }
}
