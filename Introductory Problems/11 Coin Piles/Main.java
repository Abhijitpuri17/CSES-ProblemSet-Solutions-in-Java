import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    static Scanner sc ;
    static PrintWriter out ;
    static void solve(){
        int a = sc.nextInt(), b = sc.nextInt();
        int min = Math.min(a, b) ;
        int max = Math.max(a, b) ;
        if(Math.ceil(max*1.0/2) > min){
            out.println("NO");
        } else if((a+b)%3 == 0){
            out.println("YES");
        } else out.println("NO");
        
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in) ;
        out = new PrintWriter(System.out) ;
        int t = sc.nextInt() ;
        while (t-- > 0){
            solve() ;
        }
        out.flush();
    }
}
