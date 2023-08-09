import java.util.Scanner;

public class Area_calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Length");
        int lenght = sc.nextInt();

        System.out.println("Enter Breadth");
        int Breadth = sc.nextInt();

        int Area = lenght*Breadth;


        System.out.println("Area is : "+Area);

    }
}
