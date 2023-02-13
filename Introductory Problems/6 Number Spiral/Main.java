import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    static Scanner sc ;
    static PrintWriter out ;
    static void solve(){
        long y = sc.nextLong(), x = sc.nextLong() ;
        long max = Math.max(y, x) ;
        long ans = (max-1)*(max-1) ;

        if(max%2 != 0){
            if(y == max){
                ans += x ;
            } else {
                ans += max ;
                ans += max - y ;
            }
        } else {
            if(x == max){
                ans += y;
            } else {
                ans += max;
                ans += max - x ;
            }
        }
        out.println(ans);
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in) ;
        out = new PrintWriter(System.out) ;
        int t = sc.nextInt();
        while (t-- > 0){
            solve();
        }
        out.close();
    }
}
