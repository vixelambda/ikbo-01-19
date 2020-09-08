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
public class Dog {
    private double lengthOfTail;
    private String name;
    private String colorOfEyes;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(double lengthOfTail, String name, String colorOfEyes, int age) {
        this.lengthOfTail = lengthOfTail;
        this.name = name;
        this.colorOfEyes = colorOfEyes;
        this.age = age;
    }

    public double getLengthOfTail() {
        return lengthOfTail;
    }

    public void setLengthOfTail(double lengthOfTail) {
        this.lengthOfTail = lengthOfTail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColorOfEyes() {
        return colorOfEyes;
    }

    public void setColorOfEyes(String colorOfEyes) {
        this.colorOfEyes = colorOfEyes;
    }

    @Override
    public String toString() {
        return "Dog{" + "lengthOfTail=" + lengthOfTail + ", name=" + name + ", colorOfEyes=" + colorOfEyes + ", age=" + age + '}';
    }

}
