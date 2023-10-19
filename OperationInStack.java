import java.util.Scanner;

public class OperationInStack {
    static int []arr;
    static int size =10;
    static int top =-1;

    OperationInStack(){
        arr = new int[size];

    }

    public static boolean isEmpty(){
        return top==-1;
    }

    public void add(){
        if(top==size-1){
            System.out.println("Stack is full");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to insert");
        int elem = sc.nextInt();
        top= top+1;
        arr[top]=elem;
        System.out.println("elem is inserted"+ arr[top]);
    }
    public void delete(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        return;
        }
        top--;

    }
    public void display(){
        for (int i = 0;i<=top;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        OperationInStack q = new OperationInStack();
        Scanner sc = new Scanner(System.in);
        boolean inputs = true;
        while(inputs) {
        System.out.println("Press 1-Insertion, 2 Deletion , 3 Display , 4 Exit");
        int num = sc.nextInt();
            switch (num) {
                case 1:
                    q.add();
                    break;
                case 2:
                    q.delete();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    inputs = false;
                    break;
                default:
                    System.out.println("enter a correct input");


            }

        }

    }


}
