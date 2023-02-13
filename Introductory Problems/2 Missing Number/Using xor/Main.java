import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    static Scanner sc ;
  
    public static void main(String[] args) {
        sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        int[] arr = inputArray(n-1) ;

        // We know (a xor a) = 0
        // If we take bitwise xor of all numbers in range 1 to n
        // and also numbers given in array, all the numbers except
        // the missing number in array will appear twice and will
        // cancel each other

        int xor = 0 ;
        for(int i = 1; i <= n; i++){
            xor ^= i ;
        }
        for(int ele: arr){
            xor ^= ele ;
        }
        
        System.out.println(xor);
    }
  
    static int[] inputArray(int n){
        int[] arr = new int[n] ;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        return arr ;
    }
}
