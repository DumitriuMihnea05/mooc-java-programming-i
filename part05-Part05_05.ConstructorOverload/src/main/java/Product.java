public class Product {

    private String name;
    private String location;
    private int weight;

    // Constructor cu trei parametri
    public Product(String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    // Constructor cu un parametru
    public Product(String name) {
        this(name, "shelf", 1); // Greutatea este 1, locația este "shelf"
    }

    // Constructor cu nume și locație
    public Product(String name, String location) {
        this(name, location, 1); // Greutatea implicită este 1
    }

    // Constructor cu nume și greutate
    public Product(String name, int weight) {
        this(name, "shelf", weight); // Locația implicită este "shelf"
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }
}
