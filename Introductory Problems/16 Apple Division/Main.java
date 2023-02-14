import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    static Scanner sc ;
    static PrintWriter out ;
    static void solve(long[] arr,
                      int ind,
                      long curSum,
                      long totSum,
                      long[] ans
    ) {
        if(ind == arr.length){
            ans[0] = Math.min(ans[0], Math.abs(totSum - 2*curSum)) ;
            return;
        }
        solve(arr, ind+1, curSum+arr[ind], totSum, ans) ;
        solve(arr, ind+1, curSum, totSum, ans) ;
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in) ;
        out = new PrintWriter(System.out) ;
        int n = sc.nextInt();
        long[] arr = inputArr(n) ;
        long tot = 0;
        for(long ele: arr){
            tot += ele ;
        }
        long[] ans = {Long.MAX_VALUE} ;
        solve(arr, 0, 0, tot, ans) ;
        out.println(ans[0]);
        out.flush();
    }

    private static long[] inputArr(int n){
        long[] arr = new long[n];
        for (int i = 0 ; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        return arr;
    }
}
