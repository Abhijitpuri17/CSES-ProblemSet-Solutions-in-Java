import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    static Scanner sc ;
    static PrintWriter out ;
    static void toh(int n, int source,
                    int helper, int dest,
                    ArrayList<int[]> ans){
        if(n==0){
            return;
        }
        toh(n-1, source, dest, helper, ans) ;
        ans.add(new int[]{source,dest});
        toh(n-1, helper, source, dest, ans);
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in) ;
        out = new PrintWriter(System.out) ;
        int n = sc.nextInt();
        ArrayList<int[]> ans = new ArrayList<>();
        toh(n, 1,2,3, ans);
        out.println(ans.size());
        for(int[] step: ans){
            out.println(step[0]+" "+step[1]);
        }
        out.flush();
    }
}
