import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    static FastReader fr ;
    static PrintWriter out ;
    public static void main(String[] args) throws Exception{
        fr = new FastReader() ;
        out = new PrintWriter(System.out) ;
        int n = fr.nextInt();
        int[][] arr = new int[n][2] ;
        for(int i = 0; i < n; i++){
            arr[i][0] = fr.nextInt();
            arr[i][1] = fr.nextInt();
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));
        int ans = 0 ;
        int prevEnd = 0 ;
        for(int i = 0; i < n; i++){
            if(prevEnd <= arr[i][0]){
                ans++;
                prevEnd = arr[i][1] ;
            }
        }
        out.println(ans);
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
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}
