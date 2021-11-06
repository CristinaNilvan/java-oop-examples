import java.util.ArrayList;

public class Schoolbag {
    ArrayList<SchoolSupply> schoolSupplies = new ArrayList<>();

    public void addSupply(SchoolSupply schoolSupply) {
        schoolSupplies.add(schoolSupply);
    }

    public void listItems() {
        System.out.println("All the supplies : ");

        for (SchoolSupply schoolSupply:
             schoolSupplies) {
            System.out.println(schoolSupply.getName());
        }
    }

    public void listNotebooks() {
        System.out.println("The notebooks : ");

        for (SchoolSupply schoolSupply:
                schoolSupplies) {
            if (schoolSupply instanceof Notebook)
                System.out.println(schoolSupply.getName());
        }
    }

    public void listManuals() {
        System.out.println("The manuals : ");

        for (SchoolSupply schoolSupply:
                schoolSupplies) {
            if (schoolSupply instanceof Manual)
                System.out.println(schoolSupply.getName());
        }
    }

    public int getNumberOfSchoolSupplies() {
        return schoolSupplies.size();
    }

    public int getNumberOfNotebooks() {
        int numberOfNotebooks = 0;

        for (SchoolSupply schoolSupply:
                schoolSupplies) {
            if (schoolSupply instanceof Notebook)
                numberOfNotebooks += 1;
        }

        return numberOfNotebooks;
    }

    public int getNumberOfManuals() {
        int numberOfManuals = 0;

        for (SchoolSupply schoolSupply:
                schoolSupplies) {
            if (schoolSupply instanceof Manual)
                numberOfManuals += 1;
        }

        return numberOfManuals;
    }
}
