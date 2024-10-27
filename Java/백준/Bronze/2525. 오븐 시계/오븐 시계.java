import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(br.readLine());

        if(M + T < 60){
            M = M + T;
        }else{
            H = H + ((M + T) / 60);
            M = (M + T) % 60;
        }

        if(H > 23){
            H = Math.abs(24 - H);
        }

        System.out.println(H + " " + M);
    }
}