package lab3;

public class TestDog {
    public static void main(String[] args) {
        Retriever retr = new Retriever(10,5,"white","Bob", "long");
        Shepherd shep = new Shepherd(15, 8,"black","Harry", "short");
        retr.displayInfo();
        shep.displayInfo();
        String auf = retr.getName();
        System.out.println(auf);
    }
}
