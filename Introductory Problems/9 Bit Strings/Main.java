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
        long mod = (long)1e9+7 ;
        long ans = fastPower(2, n, mod) ;
        out.println(ans);
        out.flush();
    }

    static long fastPower(long a, long b, long mod){
        long ans = 1 ;
        while (b > 0){
            if(b%2 != 0) {
                ans *= a;
                ans %= mod ;
            }
            b /= 2 ;
            a *= a;
            a %= mod ;
        }
        return ans;
    }

}
