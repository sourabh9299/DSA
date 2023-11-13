import java.util.ArrayList;
import java.util.Scanner;

public class ListArrays {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i =0;i<10;i++){
            System.out.println("Enter elem to insert");
            Scanner sc = new Scanner(System.in);
            int elem = sc.nextInt();
            lista.add(i,elem);
        }
        System.out.println(lista);
    }
}
