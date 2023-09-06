import java.util.Scanner;

public class FindHighestNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int arr[]=new int[size];

        int max=Integer.MIN_VALUE;


        for(int i=0;i<arr.length;i++){
            System.out.println("enter value of"+"["+i+"]");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("the Max val is "+max);
    }
}
