import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    static Scanner sc ;
    static PrintWriter out ;
    public static void main(String[] args) {
        sc = new Scanner(System.in) ;
        out = new PrintWriter(System.out) ;
        String s = sc.next() ;
        int[] freq = new int[26] ;
        for(int i = 0; i < s.length(); i++){
            int pos = s.charAt(i) - 'A' ;
            freq[pos]++ ;
        }
        int odds = 0 ;
        for(int i = 0; i < 26; i++){
            if(freq[i]%2 != 0){
                odds++ ;
            }
        }
        if(odds > 1){
            out.println("NO SOLUTION");
            out.flush();
            return;
        }
        char[] ansArr = new char[s.length()] ;
        int i = 0, j = ansArr.length-1;

        for(char ch = 'A'; ch <= 'Z'; ch++){
            while (freq[ch-'A'] > 0){
                if(freq[ch-'A'] == 1){
                    ansArr[s.length()/2] = ch ;
                    freq[ch-'A']-- ;
                } else {
                    ansArr[i++] = ch ;
                    ansArr[j--] = ch ;
                    freq[ch-'A'] -= 2 ;
                }
            }
        }

        out.println(new String(ansArr));

        out.flush();
    }
}
