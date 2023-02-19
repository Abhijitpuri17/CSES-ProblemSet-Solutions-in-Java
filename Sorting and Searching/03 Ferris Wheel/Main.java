import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    static FastReader fr ;
    static PrintWriter out ;
    public static void main(String[] args) {
        fr = new FastReader() ;
        out = new PrintWriter(System.out) ;
        int n = fr.nextInt();
        long x = fr.nextLong() ;
        long[] arr = inputArr(n) ;
        sort(arr);
        long ans = 0 ;
        int i = 0, j = n-1 ;
        while (i <= j) {
            ans++ ;
            if(arr[j] + arr[i] <= x){
                i++;
            }
            j-- ;
        }
        out.println(ans);
        out.flush();
    }

    private static long[] inputArr(int n){
        long[] arr = new long[n];
        for (int i = 0 ; i < n; i++) {
            arr[i] = fr.nextLong();
        }
        return arr;
    }

    private static void sort(long[] arr){
        ArrayList<Long> al = new ArrayList<>() ;
        for (long x : arr){
            al.add(x) ;
        }
        Collections.sort(al);
        for (int i = 0 ; i < arr.length; i++){
            arr[i] = al.get(i) ;
        }
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
