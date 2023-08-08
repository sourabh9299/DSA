import java.util.*;

public class Intrest_calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount");
        int p = sc.nextInt();

        System.out.println("Enter Rate Amount");
        int r = sc.nextInt();

        System.out.println("enter Year");
        int t = sc.nextInt();

        int intrest = p*r/100*t;
        int total = p+intrest;

        System.out.println("Total intrest : "+intrest);

        System.out.println("Total Amount : "+total);

    }
}
