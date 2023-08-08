import java.sql.SQLOutput;
import java.util.*;

public class Febinaci {
    public static void main(String[] args) {
//        System.out.println("check");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int a = 0 ;
        int b = 1;
        int c;

        for (int i=0 ;i< n ; i++){
//            Fabinaci no.
            System.out.println(a);
             c = a +b ; a=b; b=c;

        }
    }
}