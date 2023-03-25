import java.io.*;
import java.util.*;
public class Main {
    final static FastReader fr = new FastReader();
    final static PrintWriter out = new PrintWriter(System.out);
    static final int mod = (int) 1e9 + 7;
  
    static void solve() throws IOException {
        int n = fr.nextInt();
        int[][] dp = new int[n+1][2] ;
        dp[n][0] = dp[n][1] = 1 ;

        for(int i = n-1; i >= 1; i--){
            int op1 = (dp[i+1][1] + dp[i+1][0])%mod;
            int op2 = dp[i+1][0] ;
            int op3 = (2 * dp[i+1][0])%mod ;
            int op4 = dp[i+1][1] ;
            dp[i][0] = ((op1 + op2)%mod + op3) % mod ;
            dp[i][1] = (op1 + op4) % mod ;
        }
        long ans = (dp[1][0]+dp[1][1])%mod ;
        out.println(ans);
    }
  
    public static void main(String[] args) throws IOException {
        int t = 1;
        t = fr.nextInt();
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

    static class FastReader
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public FastReader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }
    }
}
