import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    static Scanner sc ;
  
    public static void main(String[] args) {
        sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        int[] arr = inputArray(n-1) ;
        long arrSum = 0 ;
        for(int ele: arr){
            arrSum += ele ;
        }
        long sumOfNNumbers = (long)n*(n+1)/2 ;
        long missingNum = sumOfNNumbers - arrSum ;
        System.out.println(missingNum);
    }
  
    static int[] inputArray(int n){
        int[] arr = new int[n] ;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        return arr ;
    }
}
