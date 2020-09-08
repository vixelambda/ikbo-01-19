package lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[10];
        int sum = 0;
        for (int i=0; i<10; i++) {
            System.out.print("Введите "+(i+1)+"-е значение: ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                a[i]=sc.nextInt();
            }
            else {
                while (!sc.hasNextInt()) {
                    System.out.print("Введено не целое число, попробуйте ещё раз: ");
                    sc = new Scanner(System.in);
                }
                a[i]=sc.nextInt();
            }
        }
        for (int i=0; i<10; i++) {
            sum += a[i];
        }

        /*int i = 0;
        while (i<10) {
            sum += a[i];
            i++;
        }*/

        /*int i = 0;
        do {
            sum += a[i];
            i++;
        } while(i<10);*/

        System.out.println("Сумма чисел массива = "+sum);
    }
}
