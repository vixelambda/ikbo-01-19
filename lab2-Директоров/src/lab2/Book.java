package lab2;

public class Book {
    private String author, name;
    private int year;
    public Book(String a, String n, int y){
        author = a;
        name = n;
        year = y;
    }
    public void setAuthor(String a){
        author=a;
    }
    public void setName(String n){
        name=n;
    }
    public void setYear(int y){
        year=y;
    }
    public String getAuthor(){
        return author;
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
}
