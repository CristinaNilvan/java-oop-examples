public abstract class SchoolSupply {
    protected String label;

    public SchoolSupply(String label) {
        this.label = label;
    }

    public abstract String getName();
}
