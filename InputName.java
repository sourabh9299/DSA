import java.util.Scanner;

public class InputName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = sc.next();

        System.out.println("Enter your Age ");
        String Age = sc.next();

        System.out.println("My name is "+name);
        System.out.println("My name is "+Age);

        }
}
