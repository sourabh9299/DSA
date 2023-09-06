import java.util.Scanner;

public class CompareValues {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int arr[]=new int[size];

        int min=Integer.MAX_VALUE;


        for(int i=0;i<arr.length;i++){
            System.out.println("enter value of"+"["+i+"]");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("the minimum val is "+min);
    }
}
