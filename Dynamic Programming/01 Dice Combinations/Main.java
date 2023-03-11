import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    final static FastReader fr = new FastReader();
    final static PrintWriter out = new PrintWriter(System.out);
    static long mod = (long) 1e9 + 7;
    public static void main(String[] args) {
        int n = fr.nextInt();
        long[] dp = new long[n+1] ;
        dp[0] = 1 ;

        for(int cur = 1; cur <= n; cur++){
            for(int diceVal = 1; diceVal <= 6; diceVal++){
                if(cur-diceVal >= 0){
                    dp[cur] += dp[cur-diceVal];
                    dp[cur] %= mod ;
                }
            }
        }
        out.print(dp[n]);
        out.close();
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}

