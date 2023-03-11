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
        int x = fr.nextInt();
        int[] coins = inputArr(n) ;
        long[] dp = new long[x+1] ;
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0 ;
        for(int cur = 1; cur <= x; cur++){
            for(int coin: coins){
                if(cur-coin >= 0){
                    dp[cur] = Math.min(dp[cur], dp[cur-coin]+1) ;
                }
            }
        }
        if(dp[x] == Integer.MAX_VALUE){
            out.println(-1);
        } else {
            out.println(dp[x]);
        }
        out.close();
    }
  
    static int[] inputArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = fr.nextInt();
        return arr;
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

