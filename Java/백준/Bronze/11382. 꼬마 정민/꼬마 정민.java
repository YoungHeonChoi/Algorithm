import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");

        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());
        BigInteger C = new BigInteger(st.nextToken());

        System.out.println(A.add(B).add(C));
    }
}

/**
 * BigInteger
 * new BigInteger(String)
 * + => add()
 */