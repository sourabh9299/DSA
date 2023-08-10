import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum=0;

        while (temp>0){
            int r = temp%10;
            r = r*r*r;
            sum = sum+r;
            temp = temp/10;

        }
        if(sum==num){
            System.out.println("its an Armstrong Number");
        }else{
            System.out.println("non Armstrong");
        }
    }
}
