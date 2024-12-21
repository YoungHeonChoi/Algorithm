import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer first = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(first.nextToken());
        int M = Integer.parseInt(first.nextToken());

        String[] arr = new String[N];

        int currentIndex = 0;
        int changeIndex = 0;

        String tmp = "";    
        String result = "";

        for(int i = 0; i < arr.length; i++){
            arr[i] = String.valueOf(i + 1);
        }

        for(int j = 0; j < M; j++){
            StringTokenizer second = new StringTokenizer(br.readLine(), " ");
            currentIndex = Integer.parseInt(second.nextToken()) - 1;
            changeIndex = Integer.parseInt(second.nextToken()) - 1;

            tmp = arr[currentIndex];
            arr[currentIndex] = arr[changeIndex];
            arr[changeIndex] = tmp;
        }

        for(int k = 0; k < arr.length; k++){
            if(k == arr.length - 1){
                result += arr[k];
            }else{
                result += arr[k] + " ";
            }
        }

        System.out.println(result);
    }
}