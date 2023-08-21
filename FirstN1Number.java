import java.util.Scanner;

public class FirstN1Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("first Input");
        int n1=sc.nextInt();


        System.out.println("second Input");
        int n2=sc.nextInt();
        int n=1;
//        for (int i=0;i<=n1;i++){
//            int check = (3*i)+2;
//
//            if(check%n2!=0){
//                System.out.print(" "+check);
//            }

        while(n1<0){
            int check =(3*n1)+2;
            if(check%n2!=0){
                System.out.println(check);
           n1++; }
        }

    }
}
