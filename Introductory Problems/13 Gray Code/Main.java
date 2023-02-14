import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    static Scanner sc ;
    static PrintWriter out ;
    static ArrayList<String> solve(int n) {
        if(n == 1){
            return new ArrayList<>(List.of("0", "1")) ;
        }
        ArrayList<String> prev = solve(n-1) ;
        ArrayList<String> cur = new ArrayList<>() ;
        for(int i = 0; i < prev.size() ; i++){
            cur.add("0"+prev.get(i)) ;
        }
        for(int i = prev.size()-1; i >= 0 ; i--){
            cur.add("1"+prev.get(i)) ;
        }
        return cur ;
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in) ;
        out = new PrintWriter(System.out) ;
        int n = sc.nextInt();
        ArrayList<String> ans = solve(n) ;
        for(String str: ans){
            out.println(str);
        }
        out.flush();
    }
}
