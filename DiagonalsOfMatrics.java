import java.util.Scanner;

public class DiagonalsOfMatrics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row:");
        int row=sc.nextInt();
        System.out.print("Enter column:");
        int column=sc.nextInt();
//        Enter values for matrics
        int [][]matrics=new int[row][column];
        if(row!=column){
            System.out.println("above matrics not applicable for diagonals elements");
        }else{
            for (int i =0;i<row;i++){
                for (int j =0;j<column;j++){
                    System.out.println("enter Element of i:"+i+"j:"+j);
                    matrics[i][j]=sc.nextInt();
                }
            }
        }

//        Print Diagonals 
        for(int i=0;i<row;i++){
            System.out.print(matrics[i][i]+" ");
        }

    }
}
