import java.util.Scanner;

public class QueueBasic {
    static int []arr;
    static int size=10;
    static int rear=-1;
    static int front=-1;

    QueueBasic(){
        arr = new int[size];
    }

    public static boolean isEmpty(){
        return rear==-1;
    }

    public static void add( int elem){
        if(rear==size-1){
            System.out.println("Queue is FUll / OverFLow");
            return;
        }
        rear++;
        arr[rear]= elem;
        System.out.println("Elem :" +elem +" is inserted in queue");
    }

    public static void delete(){
        if(isEmpty()){
            System.out.println("Queue is Empty / Underflow");
        }

        front++;
    }
    public static void display(){
        for (int i=0;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        QueueBasic queue = new QueueBasic();
        Scanner sc = new Scanner(System.in);
        boolean temp = true;

        while(temp){
            System.out.println("Press : 1 Insertion , 2 Deletetion , 3 Display , 4 Exit");
        int num = sc.nextInt();
            switch (num){
                case 1:
                    System.out.println("enter number to insert");
                    int elem=sc.nextInt();
                    queue.add(elem);
                    break;
                case 2:
                    queue.delete();
                    break;
                case 3:
                    System.out.print("Displaying Queue");
                    queue.display();
                    break;
                case 4:
                    temp= false;
                    break;
                default:
                    System.out.println("Enter Valid Option");
            }
        }

    }
}
