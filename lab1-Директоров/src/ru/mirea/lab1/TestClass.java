/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mirea.lab1;

/**
 *
 * @author student
 */



public class TestClass {

    public static void main(String[] args) {
        
        Dog doggy = new Dog(3.4, "Duffy", "blue", 5);
        Ball ball = new Ball(5, true, "Jonny");
        Book book = new Book("Countless Misunderstandings", 230, "philosofical detective");
        System.out.println(doggy.toString());
        System.out.println(ball.toString());
        System.out.println(book.toString());
    }
    
}
