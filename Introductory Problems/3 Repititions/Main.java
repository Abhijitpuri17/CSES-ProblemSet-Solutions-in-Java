import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    static Scanner sc ;
    public static void main(String[] args) {
        sc = new Scanner(System.in) ;
        String s = sc.next() ;
        char prev = ' ' ;
        int curLen = 0 ;
        int maxRepeatLen =  0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == prev){
                curLen++ ;
            } else {
                curLen = 1 ;
            }
            prev = s.charAt(i) ;
            maxRepeatLen = Math.max(maxRepeatLen, curLen) ;
        }
        System.out.println(maxRepeatLen);
    }
}
