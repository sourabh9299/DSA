import java.util.Scanner;

public class NumberOfZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row");
        int row = sc.nextInt();
        System.out.println("Enter Column");
        int colmn=sc.nextInt();
        int [][]matrics= new int[row][colmn];
        int zeros=0;


        for (int i =0;i<row;i++){
            for(int j=0;j<colmn;j++){
                System.out.println("enter Matrics element");
                matrics[i][j]=sc.nextInt();
                if(matrics[i][j]==0){
                    zeros=zeros+1;
                }
            }
        }

        if(zeros>(row*colmn)/2){
            System.out.println("Total zeros are"+zeros);
        }else {
            System.out.println("matrics is not Sparse Because zeros is "+zeros +"and totlal elements is "+row*colmn);
        }

    }
}
