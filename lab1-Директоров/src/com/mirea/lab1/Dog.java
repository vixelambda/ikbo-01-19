package com.mirea.lab1;

public class Dog {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "Dog "+age;
    }
}
