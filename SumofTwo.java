import java.util.Scanner;

public class SumofTwo {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{1,2,3,4};
        int sum=0;
        int arr2[]=new int[4];
        for(int i=0;i<arr.length;i++){
            sum =sum+arr[i];
            arr2[i]=sum;
        }
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr2[i]);
        }


    }
}

