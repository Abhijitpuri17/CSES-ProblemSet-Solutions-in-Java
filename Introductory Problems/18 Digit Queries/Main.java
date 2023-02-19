import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    static Scanner sc ;
    static PrintWriter out ;
    public static void main(String[] args) {
        sc = new Scanner(System.in) ;
        out = new PrintWriter(System.out) ;
        int q = sc.nextInt() ;
        while (q-- > 0){
            long k = sc.nextLong() ;
            long p = 9 ;
            int digits = 1 ;
            while(k > p){
                k -= p;
                digits++ ;
                p = (long) (9*Math.pow(10, digits-1)*digits);
            }
            k-- ;

            long x = k / digits ;
            int y = (int) (k%digits);
            long num = (long)Math.pow(10, digits-1) + x ;
            char ans = Long.toString(num).charAt(y) ;
            out.println(ans);
        }
        out.flush();
    }
}
