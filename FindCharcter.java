import java.util.Scanner;

public class FindCharcter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        int counter=0;
        String Name = sc.next();
        System.out.println("Enter Character");
        char ch = sc.next().charAt(0); // Read the first character of input as char

        for (int i = 0; i < Name.length(); i++) {
            char ab = Name.charAt(i); // Get the character at the ith position

            if (ab == ch) {
                counter=counter+1;
            }
        }
        System.out.println("Your Charachter "+ch+" Comes :"+counter+" Times");
    }
}
