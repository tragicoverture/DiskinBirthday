public class StarbucksItem {
    private String barista, descrip, name;
    public StarbucksItem(String barista, String descrip, String name) {
        this.barista = barista;
        this.descrip = descrip;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "Barista: " + barista + "\n" + "Note: " + descrip;
    }
}