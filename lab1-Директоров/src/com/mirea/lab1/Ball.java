package com.mirea.lab1;

public class Ball {
    private int radius;
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public String toString(){
        return "Ball "+ radius;
    }
}
