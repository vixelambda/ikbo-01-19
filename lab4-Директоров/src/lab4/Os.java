package lab4;

public class Os implements Priceable {
    String name;
    int price;
    public Os(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public int getPrice() {
        return price;
    }
}