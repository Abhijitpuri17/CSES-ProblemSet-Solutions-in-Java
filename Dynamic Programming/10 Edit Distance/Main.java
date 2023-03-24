import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class Main {
    final static FastReader fr = new FastReader();
    final static PrintWriter out = new PrintWriter(System.out);
  
    static void solve() {
        String s = fr.next();
        String t = fr.next();
        int n = s.length(), m = t.length();
        int[][] dp = new int[n+1][m+1] ;

        for(int i = 0; i <= n; i++){
            dp[i][0] = i ;
        }
        for(int j = 0; j <= m; j++){
            dp[0][j] = j ;
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] ;
                } else {
                    int insert = 1 + dp[i][j-1] ;
                    int delete = 1 + dp[i-1][j] ;
                    int replace = 1 + dp[i-1][j-1] ;
                    dp[i][j] = Math.min(insert, Math.min(delete, replace)) ;
                }
            }
        }

        out.println(dp[n][m]);
    }

    public static void main(String[] args) {
        int t = 1;
        while (t-- > 0) {
            solve();
        }
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
