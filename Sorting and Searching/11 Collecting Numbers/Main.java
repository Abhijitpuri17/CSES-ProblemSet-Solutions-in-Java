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
        long[] arr = inputArr(n) ;
        long ans = 0 ;
        HashSet<Long> set = new HashSet<>() ;
        for(long ele: arr){
            if(!set.contains(ele-1)){
                ans++ ;
            }
            set.add(ele) ;
        }
        out.println(ans);
        out.close();
    }

    private static long[] inputArr(int n){
        long[] arr = new long[n];
        for (int i = 0 ; i < n; i++) {
            arr[i] = fr.nextLong();
        }
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
