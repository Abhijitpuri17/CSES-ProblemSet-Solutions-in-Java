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
        HashSet<Integer> set = new HashSet<>() ;
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            set.add(x) ;
        }
        out.println(set.size());
        out.flush();
    }
}
