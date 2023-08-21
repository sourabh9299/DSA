import java.util.Scanner;

public class Assending_Decending {
    public static void main(String[] args) {

//        Insertion,Trivarsing , Shorting, Decimal to binary, Make practical File


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int Ar[] = new int[size];
        int temp = 0;

        for (int i = 0; i < size; i++) {
            System.out.println("enter Arry of" + i);
            Ar[i] = sc.nextInt();
        }

//        Arrange the array in assending order

        for (int j = 0; j < size; j++)
        {

            for (int i = j + 1; i < size; i++)
            {
                if (Ar[j] > Ar[i])
                {
                    temp = Ar[j];
                    Ar[j] = Ar[i];
                    Ar[i] = temp;

                }
            }
        }
        for (int i=0;i<size;i++){
            System.out.print(" "+Ar[i]);
        }
    }
}
