package lab9;

import java.util.Scanner;

public class ThrowsDemo1 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        printDetails( key );
    }
    public void printDetails(String key) {
        try { String message = getDetails(key);
            System.out.println( message );
        } catch (NullPointerException e) {
            throw e;
        }
    }
    private String getDetails(String key) {
        if(key == "") throw new NullPointerException( "Key set to empty string" );
        return "data for " + key; }
}