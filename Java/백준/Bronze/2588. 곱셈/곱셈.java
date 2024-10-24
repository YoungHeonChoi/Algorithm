import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        String B = br.readLine();
        char[] arrB = B.toCharArray();
        
        int rsltA = A * Character.getNumericValue(arrB[2]);
        int rsltB = A * Character.getNumericValue(arrB[1]);
        int rsltC = A * Character.getNumericValue(arrB[0]);

        System.out.println(rsltA);
        System.out.println(rsltB);
        System.out.println(rsltC);
        System.out.println(A * Integer.parseInt(B));
    }
}