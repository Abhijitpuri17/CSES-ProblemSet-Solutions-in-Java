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
        int[] dp = new int[n+1] ;
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0 ;
        for(int i = 1; i <= n; i++){
            int tmp = i ;
            while (tmp > 0){
                int l = tmp%10 ;
                if(l != 0) {
                    dp[i] = Math.min(dp[i], dp[i - l] + 1);
                }
                tmp /= 10 ;
            }
        }
        out.println(dp[n]);
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
    static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return x == pair.x && y == pair.y;
        }

        @Override
        public int hashCode() {
            int result = (int) x;
            result = (int) (31 * result + y);
            return result;
        }
    }
}
