import java.util.Scanner;

public class Area_calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Length ");
        int lenght = sc.nextInt();

        System.out.println("Enter Breadth  ");
        int Breadth = sc.nextInt();

        System.out.println("Input radius");
        int r = sc.nextInt();
        float criclearea= (22/7)*r*r;
        float circumf= 2*(22/7)*r;
        System.out.println("Perameter of Circle :"+circumf);
        System.out.println("Area of Cicle :"+criclearea);
        int Area = lenght*Breadth;

        int recPerameter = 2*(lenght+Breadth);


        System.out.println("Area of Reactangle : "+Area);
        System.out.println("Perameter of Rectangle  is : "+recPerameter);


    }
}
