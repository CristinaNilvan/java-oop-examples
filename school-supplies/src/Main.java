public class Main {

    public static void main(String[] args) {
        Schoolbag schoolbag = new Schoolbag();

        SchoolSupply notebook01 = new Notebook("Mathematics");
        SchoolSupply notebook02 = new Notebook("Biology");
        SchoolSupply notebook03 = new Notebook("Informatics");

        SchoolSupply manual01 = new Manual("Mathematics");
        SchoolSupply manual02 = new Manual("Biology");
        SchoolSupply manual03 = new Manual("Informatics");

        schoolbag.addSupply(notebook01);
        schoolbag.addSupply(notebook02);
        schoolbag.addSupply(notebook03);

        schoolbag.addSupply(manual01);
        schoolbag.addSupply(manual02);
        schoolbag.addSupply(manual03);

        System.out.println("Number of supplies : " + schoolbag.getNumberOfSchoolSupplies());
        schoolbag.listItems();

        System.out.println("Number of notebooks : " + schoolbag.getNumberOfNotebooks());
        schoolbag.listNotebooks();

        System.out.println("Number of manuals : " + schoolbag.getNumberOfNotebooks());
        schoolbag.listManuals();
    }
}
