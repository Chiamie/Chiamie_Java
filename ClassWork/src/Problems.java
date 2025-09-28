public class Problems {
    private String name;
    private Type type;
    private boolean status;

    public Problems(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void isSolved() {
        this.status = true;
    }
}
