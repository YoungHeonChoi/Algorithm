import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer first = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(first.nextToken());
        int M = Integer.parseInt(first.nextToken());

        String[] arr = new String[N + 1];

        int start = 0;
        int end = 0;
        String ball = "";

        String result = "";

        for(int i = 0; i < M; i++){
            StringTokenizer second = new StringTokenizer(br.readLine(), " ");

            start = Integer.parseInt(second.nextToken());
            end = Integer.parseInt(second.nextToken());
            ball = second.nextToken();

            for(int j = start; j <= end; j++){
                arr[j] = ball;
            }
        }

        for(int k = 1; k < arr.length; k++){
            if(arr[k] == null){
                arr[k] = "0";
            }

            if(k == arr.length - 1){
                result += arr[k];
            }else{
                result += arr[k] + " ";
            }
        }

        System.out.println(result);
    }
}