import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int n = sc.nextInt();
        int count=0;

        for(int i =1;i<=6;i++){
            if(count>2){
                System.out.println("Its a non prime");
                break;
            } else{
                System.out.println("prime");

            }
           i++;

        }




    }
}
