package lab7;

public class Auto {
    private String brand, color;
    private int mileage, age;

    public Auto(String brand, String color, int mileage, int age) {
        this.brand = brand;
        this.color = color;
        this.mileage = mileage;
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getMileage() {
        return mileage;
    }

    public int getAge() {
        return age;
    }

    public void Info() {
        System.out.println("Auto {" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                ", age=" + age +
                '}');
    }
}
