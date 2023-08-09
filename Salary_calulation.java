import java.util.*;
public class Salary_calulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Salary");
        int base_salary= sc.nextInt();
        int DA = base_salary*40/100;
        int HRA = base_salary*20/100;

        int gross = base_salary+DA+HRA;
        System.out.println("Your Gross Salary is :"+ gross);

    }
}
