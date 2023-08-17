import java.util.Scanner;

public class MetricInverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row");
        int r = sc.nextInt();

        System.out.println("enter column");
        int col = sc.nextInt();
        int arr[][] =new int[r][col];

        for(int i=0;i<r;i++){
           for (int j=0;j<col;j++){
               System.out.println("enter Arr1"+"["+i+"]"+"["+j+"]" );
               arr[i][j]=sc.nextInt();
           }
        }

        System.out.println("Second Matrics Row");
        int r1= sc.nextInt();

        System.out.println("Second Matrics Col");
        int col1= sc.nextInt();

        int arr2[][]=new int[r1][col1];

        for(int i=0;i<r1;i++){
            for(int j=0;j<col1;j++){
                System.out.println("enter Arr1"+"["+i+"]"+"["+j+"]" );
                arr2[i][j]= sc.nextInt();
            }
        }


        for (int i =0;i<r;i++){
            for (int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


//      Multiplication  Transpose of a matrics




    }
}
