package pr16;

final public class Drink implements Item {
    private int price;
    private String name;
    private String description;

    public Drink(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Drink(int price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}