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
        int m = fr.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>() ;
        StringBuffer res = new StringBuffer();
        for(int i = 0; i < n; i++){
            int x = fr.nextInt();
            map.put(x, map.getOrDefault(x, 0)+1) ;
        }

        for(int i = 0; i < m; i++){
            int c = fr.nextInt();
            if(map.floorKey(c) == null){
                res.append("-1\n") ;
                continue;
            }
            int floorKey = map.floorKey(c) ;
            int freq = map.get(floorKey) ;
            res.append(floorKey).append("\n") ;
            if(freq == 1){
                map.remove(floorKey) ;
            } else {
                map.put(floorKey,freq-1) ;
            }
        }
        out.print(res);
        out.close();
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
