import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int remainValue = 0;

        if(M < 45){
            --H;

            if(H < 0){
                H = 23;
            }

            remainValue = Math.abs(M - 45);
            M = 60 - remainValue;

            System.out.println(H + " " + M);
        }else{
            M -= 45;
            System.out.println(H + " " + M);
        }
    }
}