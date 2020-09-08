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
public class Ball {
    
    private double diameter;
    private boolean jumpingAbility;
    private String name;

    public Ball(double diameter, boolean jumpingAbility, String name) {
        this.diameter = diameter;
        this.jumpingAbility = jumpingAbility;
        this.name = name;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public boolean isJumpingAbility() {
        return jumpingAbility;
    }

    public void setJumpingAbility(boolean jumpingAbility) {
        this.jumpingAbility = jumpingAbility;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ball{" + "diameter=" + diameter + ", jumpingAbility=" + jumpingAbility + ", name=" + name + '}';
    }
}
