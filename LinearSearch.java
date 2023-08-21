import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("enter Array");
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        boolean check = false;

        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("enter Number to search");
        int nmb = sc.nextInt();

        for(int i =0;i<size;i++){
            if(arr[i]==nmb){
                check=true;
                break;
            }
        }

        if(check){
            System.out.printf("found");
        }
    }
}
