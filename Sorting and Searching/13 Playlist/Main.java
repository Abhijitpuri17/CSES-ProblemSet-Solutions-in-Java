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
        long maxLen = 0 ;
        int start = 0 ;
        HashMap<Long, Integer> lastIndex = new HashMap<>() ;
        for(int end = 0; end < n; end++){
            if(lastIndex.containsKey(arr[end])){
                start = Math.max(start, lastIndex.get(arr[end])+1);
            }
            int curLen = end - start + 1 ;
            maxLen = Math.max(maxLen, curLen) ;
            lastIndex.put(arr[end], end) ;
        }
        out.println(maxLen);
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
