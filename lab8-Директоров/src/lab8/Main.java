package lab8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("file.txt",false)) {
            System.out.print("Введите текст: ");
            for(int i=0; i<5; i++) {
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                writer.write(s + '\n');
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}