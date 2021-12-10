public class Client {
    private String fullName;
    private String petName;

    public Client(String fullName, String petName) {
        this.fullName = fullName;
        this.petName = petName;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Client{" +
                "fullName='" + fullName + '\'' +
                ", petName='" + petName + '\'' +
                '}';
    }
}
