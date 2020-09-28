package lab10;

public class Array<E> {
    private E[] a;
    E getElement(int i){
        return  a[i] ;
    }
    public void set_a(E [] a){
        this.a = a;
    }
    public int getLength(){
        return  a.length ;
    }
}