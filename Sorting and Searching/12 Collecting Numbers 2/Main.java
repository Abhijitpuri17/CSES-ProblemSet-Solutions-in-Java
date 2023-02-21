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
        int m = fr.nextInt() ;
        int[] index = new int[n+2] ;
        int[] arr = new int[n+2] ;
        Arrays.fill(index, n+1);
        int ans = 0 ;
        for(int i = 1; i <= n; i++){
            int x = fr.nextInt();
            arr[i] = x ;
            index[x] = i ;
            if(index[x-1] >= i){
                ans++ ;
            }
        }

        for(int i = 0; i < m; i++){
            int indA = fr.nextInt();
            int indB = fr.nextInt();
            int a = arr[indA];
            int b = arr[indB];
            swap(arr, indA, indB);
            if (index[a-1] <= index[a] && index[a-1] > indB) ans++;
            if (index[a-1] > index[a] && index[a-1] <= indB) ans--;
            if (index[a] <= index[a+1] && indB > index[a+1]) ans++;
            if (index[a] > index[a+1] && indB <= index[a+1]) ans--;
            index[a] = indB;
            if (index[b-1] <= index[b] && index[b-1] > indA) ans++;
            if (index[b-1] > index[b] && index[b-1] <= indA) ans--;
            if (index[b] <= index[b+1] && indA > index[b+1]) ans++;
            if (index[b] > index[b+1] && indA <= index[b+1]) ans--;
            index[b] = indA;
            out.println(ans);
        }
        out.close();
    }
    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a] ;
        arr[a] = arr[b] ;
        arr[b] = tmp ;
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
