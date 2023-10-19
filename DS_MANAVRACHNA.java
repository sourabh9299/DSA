import java.util.*;

public class DS_MANAVRACHNA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array Size");
        int n = sc.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("input array value [" + i+ "]");
            arr[i] = sc.nextInt();
        }

        // Input value to insert
        System.out.println("Input value to insert");
        int input = sc.nextInt();

        // Find the middle index
        int middle = n / 2;

       //spacing
        for (int j = n - 1; j > middle; j--) {
            arr[j] = arr[j - 1];
        }

        // Insert the new element in the middle
        arr[middle] = input;

        // Print the updated array
        System.out.println("Updated array:");
        //For each loop
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
