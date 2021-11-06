public class Notebook extends SchoolSupply {

    public Notebook(String label) {
        super(label);
    }

    public String getName() {
        return this.label + " notebook";
    }
}
