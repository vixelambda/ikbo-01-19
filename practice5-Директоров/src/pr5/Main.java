package pr5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        palindrome(s,0);
        System.out.println(razv(10179, 0));
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        int b = sca.nextInt();
        System.out.println(zero(a,b));
    }
    public static void palindrome(String s, int i) {
        if (s.charAt(i)==s.charAt(s.length()-i-1)) {
            if (i<=(s.length()/2)) palindrome(s, i+1);
            else System.out.println("Yes");
        }
        else System.out.println("No");
    }
    public static int razv(int x,int y){
        if(x>0){
            y=10*y+x%10;
            x/=10;
            return razv(x,y);
        }
        else return y;
    }
    public static int zero(int a, int b){
        if (a>b+1) return 0;
        if (a==0 || b==0) return 1;
        return zero(a,b-1)+zero(a-1,b-1);
    }
}