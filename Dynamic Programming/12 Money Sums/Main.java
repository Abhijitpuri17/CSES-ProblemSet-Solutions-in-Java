import java.io.*;
import java.util.*;
public class Main {
    final static FastReader fr = new FastReader();
    final static PrintWriter out = new PrintWriter(System.out);
    static void solve() throws IOException {
       int n = fr.nextInt();
       int[] coins = inputArr(n) ;
       int sum  = 0;
       for(int ele: coins){
           sum += ele ;
       }
       boolean[][] dp = new boolean[n+1][sum+1] ;
       dp[0][0] = true ;

       for(int ind = 1; ind <= n; ind++){
           dp[ind][0] = true;
           for(int val = 1; val <= sum; val++){
               boolean notTake = dp[ind-1][val] ;
               boolean take = false ;
               if(val-coins[ind-1] >= 0)
                   take = dp[ind-1][val- coins[ind-1]] ;
               dp[ind][val] = take | notTake ;
           }
       }
       ArrayList<Integer> ans = new ArrayList<>() ;
       for(int i = 1; i <= sum; i++){
           if(dp[n][i]){
               ans.add(i);
           }
       }

       out.println(ans.size());
       for(int ele: ans){
           out.print(ele+" ");
       }
       out.println();
    }
    public static void main(String[] args) throws IOException {
        int t = 1;
        while (t-- > 0) {
            solve();
        }
        out.close();
    }
    static int[] inputArr(int n) throws IOException {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = fr.nextInt();
        return arr;
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
