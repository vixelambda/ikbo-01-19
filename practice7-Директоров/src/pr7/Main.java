package pr7;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max=106, c=0;
        int x,y;
        ArrayDeque<Integer> d1 = new ArrayDeque<Integer>();
        ArrayDeque<Integer> d2 = new ArrayDeque<Integer>();
        input(d1);
        input(d2);
        System.out.println("Колода 1-го игрока: "+d1);
        System.out.println("Колода 2-го игрока: "+d2+'\n');
        while(!d1.isEmpty() && !d2.isEmpty() && c<max){
            x=d1.removeFirst();
            y=d2.removeFirst();
            if (x==0 && y==9){
                d1.addLast(x);
                d1.addLast(y);
            }
            else {
                if (x==9 && y==0){
                    d2.addLast(x);
                    d2.addLast(y);
                }
                else {
                    if (x>y) {
                        d1.addLast(x);
                        d1.addLast(y);
                    }
                    if (x<y) {
                        d2.addLast(x);
                        d2.addLast(y);
                    }
                }
            }
            if(x==y) {
                d1.addLast(x);
                d2.addLast(y);
            }
            c++;
        }
        if (c>=max) System.out.println("botva");
        else {
            if (d1.isEmpty()) System.out.println("second " + c);
            if (d2.isEmpty()) System.out.println("first " + c);
        }
    }
    private static void input(ArrayDeque<Integer> d){
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<5; i++){
            d.add(scanner.nextInt());
        }
    }
}