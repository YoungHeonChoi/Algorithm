import java.util.*;
import java.io.*;

public class Main{
    public static void main (String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        String[] arr = br.readLine().split(" ");
        ArrayList<String> rsltArr = new ArrayList<>();
        String rslt = "";

        for(int i = 0; i < n; i++){
            if(Integer.parseInt(arr[i]) < x){
                rsltArr.add(arr[i]);
                rsltArr.add(" ");
            }
        }

        for(int j = 0; j < rsltArr.size()-1; j++){
            rslt += rsltArr.get(j);
        }

        System.out.println(rslt);
    }
}