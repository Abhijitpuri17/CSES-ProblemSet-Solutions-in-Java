import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    static Scanner sc ;
    public static void main(String[] args) {
        sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        int[] arr = inputArray(n) ;
        long ans = 0 ;
        int cur = arr[0] ;
        for(int i = 1; i < n; i++){
            if(arr[i] < cur){
                ans += (cur-arr[i]) ;
            }
            cur = Math.max(cur, arr[i]) ;
        }
        System.out.println(ans);
    }

    static int[] inputArray(int n){
        int[] arr = new int[n] ;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        return arr ;
    }
}
