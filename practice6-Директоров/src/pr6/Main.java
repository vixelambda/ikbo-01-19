package pr6;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int n = 3;
        Student[] a = new Student[n];

        a[0]=new Student("Bob", 2, 5);
        a[1]=new Student("Garry", 3, 4);
        a[2]=new Student("Tom", 1, 5);

        System.out.println("Исходный массив: ");
        for (int i=0; i<n; i++){
            System.out.println(a[i].getName() + " " + a[i].getiDNumber() + " " + a[i].getMark());
        }

        sort(a, n);
        System.out.println("Отсортированный массив: ");
        for (int i=0; i<n; i++){
            System.out.println(a[i].getName() + " " + a[i].getiDNumber() + " " + a[i].getMark());
        }
    }

    private static void sort(Student[] a, int n) {
        for (int i = 1; i < n; i++) {
            Student c = a[i];
            int j = i - 1;
            while (j >= 0 && a[j].getiDNumber() > c.getiDNumber()) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = c;
        }
    }
}