package lab4;

public class Main {
    public static void main(String[] args) {
        Priceable o1=new Os("pen",70);
        Priceable o2=new Os("pencil",40);
        System.out.println("Цена ручки: "+o1.getPrice());
        System.out.println("Цена карандаша: "+o2.getPrice());
        System.out.println("Их сумма: "+(o1.getPrice()+ o2.getPrice()));
        o1=new Book("Encyclopedia", 800);
        System.out.println("Цена энциклопедии: "+o1.getPrice());
    }
}