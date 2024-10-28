import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int rslt = 0;

        // 모두 다를 경우
        if(a != b && a != c){
            rslt = Math.max(a, Math.max(b, c)) * 100;
        }

        // 두개 같을 경우
        if(a == b || a == c || b == c){
            if(a == b){
                rslt = 1000 + a * 100;
            }else if(a == c){
                rslt = 1000 + a * 100;
            }else if(b == c){
                rslt = 1000 + b * 100;
            }
        }

        // 모두 같을 경우
        if(a == b && a == c){
            rslt = 10000 + a * 1000;
        }

        System.out.println(rslt);
    }
}