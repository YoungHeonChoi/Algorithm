import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int max = -1000000;
        int min = 1000000;

        for(int i = 0; i < n; i++){
            if(max < Integer.parseInt(arr[i])){
                max = Integer.parseInt(arr[i]);
            }

            if(min > Integer.parseInt(arr[i])){
                min = Integer.parseInt(arr[i]);
            }
        }

        System.out.println(min + " " + max);
    }
}