public class OperationInStack {
    static int arr[];
    static int size;
    static int top =-1;

    OperationInStack(int n){
        arr = new int[n];
        this.size = n;

    }

    public static boolean isEmpty(){
        return top==-1;
    }

    public static void add(int elem){
        if(top==size-1){
            System.out.println("Stack is full");
        }
        top= top+1;
        arr[top]=elem;
        System.out.println("elem is inserted"+ arr[top]);
    }

    public static void main(String[] args) {
        OperationInStack q = new OperationInStack(10);
        q.add(11);

    }


}
