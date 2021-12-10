public class Dog extends Animal {
    protected String breed;
    protected boolean dailyWalk;

    public Dog(String petName, int petId, String arrivalDate, String departureDate, String breed, boolean dailyWalk) {
        super(petName, petId, arrivalDate, departureDate);
        this.breed = breed;
        this.dailyWalk = dailyWalk;
    }

    public boolean needsDailyWalk() {
        return dailyWalk;
    }

    public void fetch() {
        System.out.println(petName + " fetch!");
    }

    public void train() {
        System.out.println(petName + " is training.");
    }

    public void sleep() {
        System.out.println(petName + " sleeps");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "petName='" + petName + '\'' +
                ", petId=" + petId +
                ", arrivalDate='" + arrivalDate + '\'' +
                '}';
    }
}
