import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int chk = Integer.parseInt(br.readLine());
        int result = 0;

        for(int j = 0; j < cnt; j++){
            if(Integer.parseInt(arr[j]) == chk){
                ++result;
            }
        }

        System.out.println(result);
    }
}