import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int str = 0;
        int tmp = Integer.parseInt(br.readLine());
        int ord = 1;

        for(int i = 2; i <= 9; i++){
            str = Integer.parseInt(br.readLine());

            if(tmp < str){
                tmp = str;
                ord = i;
            }
        }

        System.out.println(tmp);
        System.out.println(ord);
    }
}