import java.sql.SQLOutput;
import java.util.*;

public class Febinaci {
    public static void main(String[] args) {
//        System.out.println("check");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int num = 0 ;
        for (int i=0 ;i< n ; i++){
            num = num + n ;
            System.out.print(" "+n);
        }
    }
}