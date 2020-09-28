package pr10;

public class Main {
    public static void main(String[] args) {
        Complex complex = new ConcreteFactory().createComplex(1, 1);
        System.out.println(complex);
    }
}
