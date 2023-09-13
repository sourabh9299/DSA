import java.util.Scanner;

public class FindCharcter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter Name");
        String Name = sc.next();
        System.out.println("enter Charcter");
        String ch =sc.next();
        for(int j =0;j<Name.length();j++){
            String tocheck=Name.charAt(j);
            if(tocheck==ch){

            }
        }

    }
}
