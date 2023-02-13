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
        long sum = n*(n+1)/2 ;
      
        if(sum%2 != 0){
            out.println("NO");
        } else {
            HashSet<Long> vis = new HashSet<>() ;
            long half = sum / 2 ;
            long curSum  = 0;
            for(long i = n; i >= 1; i--){
                if(curSum + i <= half){
                    curSum += i ;
                    vis.add(i) ;
                }
            }
            out.println("YES");
            out.println(vis.size());
            for(long ele: vis){
                out.print(ele+" ");
            }
            out.println();
            out.println(n-vis.size());
            for(long i = 1; i <= n; i++){
                if(!vis.contains(i)){
                    out.print(i+" ");
                }
            }
            out.println();
        }

        out.flush();
    }
}
