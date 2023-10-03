import java.util.Scanner;

public class Inheritance {
    int salary, bonus;
    void Inputs(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Input Salary");
        salary = sc.nextInt();
        System.out.println("Input bonus");
        bonus= sc.nextInt();

    }

}

class Caluclation extends Inheritance{
    void calculation(){
    int sum = salary+bonus;
        System.out.println(sum);
    }

    public static void main(String[] args) {
     Caluclation c = new Caluclation();
     c.Inputs();
     c.calculation();
    }
}


