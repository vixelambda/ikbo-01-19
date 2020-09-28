package lab7;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Auto> autos = new LinkedList<>();

        autos.add(new Auto("Volkswagen","yellow", 60000, 5));
        autos.add(new Auto("BMW","black", 30000, 3));
        autos.addFirst(new Auto("Mercedes","white", 10000, 1));
        autos.addLast(new Auto("Cadillac","grey", 20000, 3));
        autos.add(1,new Auto("Opel", "white", 8000, 2));

        System.out.println("В списке "+autos.size()+" элементов:");
        for(Auto auto : autos) {
            System.out.println(auto.getBrand());
        }
        autos.remove(2);
        for (int i = 0; i < autos.size(); i++){
            autos.get(i).Info();
        }
    }
}
