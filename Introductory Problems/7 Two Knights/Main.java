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
        for(long i = 1; i <= n; i++){
            long sq = i*i ;
            long tot = sq * (sq-1) / 2 ;
            long attack = 4 * (i-1)*(i-2) ;
            long safeWays = tot - attack ;
            out.println(safeWays);
        }
        out.flush();
    }
}
