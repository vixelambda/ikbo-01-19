package lab3;

public abstract class Dog {
    private int weight;
    private int age;
    private String color;
    private String name;

    public Dog(int weight, int age, String color, String name) {
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.name=name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void displayInfo();
}