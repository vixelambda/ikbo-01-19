package lab10;

public class Main {
    public static void main(String[] args) {
        Array<Object>a1=new Array<Object>();
        Object x[]= new Object[5];
        x[0]="nolik";
        x[1]=1;
        x[2]=2;
        x[3]="troika";
        x[4]=4;
        a1.set_a(x);
        System.out.println(a1.getElement(0));
        System.out.println(a1.getElement(1));
        System.out.println(a1.getElement(3));
    }
}