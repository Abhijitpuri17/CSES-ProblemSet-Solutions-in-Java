import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        long n = sc.nextLong() ;
        while (n != 1){
            System.out.print(n+" ");
            if((n&1) == 0){
                n /= 2 ;
            } else {
                n = 3*n + 1 ;
            }
        }
        System.out.println(1);
    }
}
