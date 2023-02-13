import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    static Scanner sc ;
    static PrintWriter out ;
    public static void main(String[] args) {
        sc = new Scanner(System.in) ;
        out = new PrintWriter(System.out) ;
        long n = sc.nextLong() ;
        long ans = 0 ;
        long cur = 5 ;
        while (cur <= n){
            ans += n / cur ;
            cur *= 5 ;
        }
        out.println(ans);
        out.flush();
    }
}
