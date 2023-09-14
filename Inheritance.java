import java.util.Scanner;

public class Inheritance {
    int salary, bonous;
    void Inputs(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Salary");
        salary = sc.nextInt();
        System.out.println("Input Bonous");
        bonous= sc.nextInt();

    }

}

class caluclation extends Inheritance{
    void calculation(){
    int sum = salary+bonous;
        System.out.println(sum);
    }

    public static void main(String[] args) {
     caluclation c = new caluclation();
     c.Inputs();
     c.calculation();
    }
}


