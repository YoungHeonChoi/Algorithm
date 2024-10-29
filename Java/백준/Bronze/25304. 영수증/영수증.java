import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());
        int totalCnt = Integer.parseInt(br.readLine());
        int price = 0;
        int cnt = 0;
        int result = 0;

        for(int i = 0; i < totalCnt; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            price = Integer.parseInt(st.nextToken());
            cnt = Integer.parseInt(st.nextToken());

            result = result + price * cnt;
        }

        if(total == result){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}