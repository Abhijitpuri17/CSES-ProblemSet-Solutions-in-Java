import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class Main {
    final static FastReader fr = new FastReader();
    final static PrintWriter out = new PrintWriter(System.out);
    static final int mod = (int) 1e9 + 7;
    static ArrayList<Integer> primes;
    static long[] fact;
    static void solve() {
        int n = fr.nextInt();
        int x = fr.nextInt();
        int[] price = inputArr(n) ;
        int[] pages = inputArr(n) ;
        int[] dp = new int[x+1] ;
        for(int i = 1; i <= n; i++){
            for(int j = x; j >= 0; j--){
                int take = 0 ;
                if(j - price[i-1] >= 0){
                    take = dp[j-price[i-1]] + pages[i-1] ;
                }
                int notTake = dp[j] ;
                dp[j] = Math.max(take, notTake) ;
            }
        }
        out.println(dp[x]);
    }
  
    public static void main(String[] args) {
        int t = 1;
        int p = 1 ;
        while (t-- > 0) {
            p++;
            solve();
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
