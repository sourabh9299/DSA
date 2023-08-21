import java.util.Scanner;

public class Deletion {
    public static void main(String[] args) {
        System.out.println("Enter Array Size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int ar[]=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter array of "+"["+i+"]");
            ar[i] = sc.nextInt();
        }

        System.out.println("enter Position to delete");
        int pos = sc.nextInt();

        System.out.println("Enter Element");
        int elem = sc.nextInt();

        for(int i=1;i<=5;i++){
            System.out.println("check");
        }

    }
}
