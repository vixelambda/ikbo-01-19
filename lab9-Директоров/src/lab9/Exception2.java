package lab9;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Введите целое число: ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0");
        } catch (Exception e) {
            System.out.println("Не целое число");
        }
        finally {
            System.out.println("Finally");
        }
    }
}