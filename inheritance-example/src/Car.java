public class Car extends Vehicle {
    private String name;

    public Car() {
        name = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        String details = this.name + ", " + super.getModel() + ", " + super.getSpeed();

        return details;
    }
}
