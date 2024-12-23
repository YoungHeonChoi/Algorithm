import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String result = "";

        for(int i = N; i > 0; i--){
            result = "";

            for(int j = 1; j <= N; j++){
                if(i <= j){
                    result += "*";
                }else{
                    result += " ";
                }
            }

            System.out.println(result);
        }
    }
}