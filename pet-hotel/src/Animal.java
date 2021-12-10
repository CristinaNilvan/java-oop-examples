public class Animal {
    protected String petName;
    protected int petId;
    protected String arrivalDate;
    protected String departureDate;

    public Animal(String petName, int petId, String arrivalDate, String departureDate) {
        this.petName = petName;
        this.petId = petId;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
    }

    public String getPetName() {
        return petName;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }
}
