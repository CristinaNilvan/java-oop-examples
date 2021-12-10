public class Cat extends Animal {
    protected String age;

    public Cat(String petName, int petId, String arrivalDate, String departureDate, String age) {
        super(petName, petId, arrivalDate, departureDate);
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void drinkMilk() {
        System.out.println(petName + " drinks milk.");
    }

    public void climb() {
        System.out.println(petName + " climbs.");
    }

    public void sleep() {
        System.out.println(petName + " sleeps.");
    }

    public void play() {
        System.out.println(petName + " is playing.");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "petName='" + petName + '\'' +
                ", petId=" + petId +
                ", arrivalDate='" + arrivalDate + '\'' +
                '}';
    }
}
