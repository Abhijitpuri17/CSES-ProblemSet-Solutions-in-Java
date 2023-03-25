import java.io.*;
import java.util.*;
public class Main {
    final static FastReader fr = new FastReader();
    final static PrintWriter out = new PrintWriter(System.out);
 
    static void solve() throws IOException {
        int a = fr.nextInt();
        int b = fr.nextInt();
        long[][] dp = new long[a+1][b+1] ;
        for(int i = 0; i <= a; i++){
            Arrays.fill(dp[i], Long.MAX_VALUE);
        }

        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= b; j++){
                if(i == j){
                    dp[i][j] = 0 ;
                    continue;
                }
                for(int k = 1; k < i; k++){
                    long cur = dp[k][j] + dp[i-k][j] + 1 ;
                    dp[i][j] = Math.min(cur, dp[i][j]) ;
                }
                for(int k = 1; k < j; k++){
                    long cur = dp[i][k] + dp[i][j-k] + 1;
                    dp[i][j] = Math.min(dp[i][j], cur) ;
                }
            }
        }
        out.println(dp[a][b]);
    }
    public static void main(String[] args) throws IOException {
        int t = 1;
        //t = fr.nextInt();
        while (t-- > 0) {
            solve();
        }
        out.close();
    }
   
    private static class FastReader {
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
