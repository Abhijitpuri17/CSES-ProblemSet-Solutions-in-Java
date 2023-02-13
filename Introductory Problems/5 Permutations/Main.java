import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    static Scanner sc ;
    static PrintWriter out ;
    public static void main(String[] args) {
        sc = new Scanner(System.in) ;
        out = new PrintWriter(System.out) ;
        int n = sc.nextInt();
        if(n == 3 || n == 2){
            out.println("NO SOLUTION");
        }
        else{
            for(int i = 2; i <= n; i += 2){
                out.print(i+" ");
            }
            for(int i = 1; i <= n; i += 2){
                out.print(i+ " ");
            }
            out.println();
        }
        out.close();
    }
}
