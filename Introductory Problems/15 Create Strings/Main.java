import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    static Scanner sc ;
    static PrintWriter out ;

    static void createStrings(char[] cur,
                              String str,
                              boolean[] vis,
                              int ind,
                              TreeSet<String> ans) {
        if(ind == str.length()){
            ans.add(new String(cur)) ;
            return;
        }

        for(int i = 0; i < str.length(); i++){
            if(!vis[i]){
                vis[i] = true ;
                cur[ind] = str.charAt(i) ;
                createStrings(cur, str, vis, ind+1, ans);
                vis[i] = false ;
            }
        }
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in) ;
        out = new PrintWriter(System.out) ;
        String s = sc.next() ;
        int n = s.length() ;
        TreeSet<String> ans = new TreeSet<>() ;
        boolean[] vis = new boolean[n] ;
        createStrings(new char[n], s, vis, 0, ans);
        out.println(ans.size());
        for(String str: ans){
            out.println(str);
        }
        out.flush();
    }
}
