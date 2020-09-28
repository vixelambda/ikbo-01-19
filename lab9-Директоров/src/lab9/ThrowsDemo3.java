package lab9;

import java.util.Scanner;

public class ThrowsDemo3 {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter Key ");
        while (myScanner.hasNextLine()) {
            try {
                String key = myScanner.nextLine();
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println("Пустая строка");
            }
        }
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );

    }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}