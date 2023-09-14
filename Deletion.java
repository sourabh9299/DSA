import java.util.Scanner;

public class Deletion {
    public static void main(String[] args) {
        System.out.println("Enter Array Size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int ar[]=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter array of "+"["+i+"]");
            ar[i] = sc.nextInt();
        }




        System.out.println("Enter Position to delete");
        int pos = sc.nextInt();

        if (pos >= 0 && pos < size) {
            for (int i = pos; i < size - 1; i++) {
                ar[i] = ar[i + 1];
            }
            size--; // Reduce the size of the array
            System.out.println("Element at position " + pos + " deleted successfully.");
        } else {
            System.out.println("Invalid position. Element not deleted.");
        }

       for(int j:ar){
           System.out.println(j);
        }
    }
}
