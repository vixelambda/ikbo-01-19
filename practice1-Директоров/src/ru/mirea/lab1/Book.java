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
public class Book {
    
    private String title;
    private int amountOfPages;
    private String genre;

    public Book(String title, int amountOfPages, String genre) {
        this.title = title;
        this.amountOfPages = amountOfPages;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", amountOfPages=" + amountOfPages + ", genre=" + genre + '}';
    }
    
}
