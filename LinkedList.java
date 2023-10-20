import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int a) {
        this.data = a;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    void insertion(int elem) {
        Node n = new Node(elem);

        if (head == null) {
            n.next = null;
            head = n;
            System.out.println("Element inserted");

        } else {
            n.next = head;
            head = n;
            System.out.println("Element inserted");
        }
    }
    void display() {
        Node current = head;
        System.out.println("check");
        while (current != null) {
            System.out.print(current.data + "-> ");
            System.out.println("check");
            current = current.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Case ");
        boolean check = true;
        while (check) {
        int ca = sc.nextInt();
            switch (ca) {
                case 1 -> {
                    System.out.println("enter number to insert");
                    int num = sc.nextInt();
                    list.insertion(num);
                }
                case 2 -> {
                    System.out.println("printing elements");
                    list.display();

                }
                case 4 -> {System.out.println("end");
                check=false;}

            }
        }

    }

    }


