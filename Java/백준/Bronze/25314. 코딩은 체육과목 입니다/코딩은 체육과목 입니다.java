import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String str = "";

        for(int i = 1; i <= a; i++){
            if(i % 4 == 0){
                str += "long ";
            }
        }

        str += "int";

        System.out.println(str);
    }
}