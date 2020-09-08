package com.mirea.lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Ball ball = new Ball();
        Book book = new Book();
        Dog dog = new Dog();
        ball.setRadius(in.nextInt());
        book.setName(in.next());
        dog.setAge(in.nextInt());
        System.out.println(ball.toString());
        System.out.println(book.toString());
        System.out.println(dog.toString());
    }
}
