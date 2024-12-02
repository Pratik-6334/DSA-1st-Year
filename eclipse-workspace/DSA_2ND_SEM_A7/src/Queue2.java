import java.util.Scanner;

class Node {
    int info;
    Node next;
    
    Node(int info) {
        this.info = info;
        this.next = null;
    }
}
public class Queue2 {
    public static Node rear = null;
    public static Node front = null;

    public static void insert() {
        Scanner sc = new Scanner(System.in);
        Node p = new Node(0);
        System.out.print("Enter the element to insert: ");
        p.info = sc.nextInt();
        System.out.println("Element inserted.");
        sc.close();
        if (front == null) {
            front = p;
            rear = p;
        } else {
            rear.next = p;
            rear = p;
        }
    }
    public static void delete() {
        if (front == null) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Deleted element: " + front.info);
            front = front.next;
            if (front == null) {
                rear = null;
            }
       }
    }
    public static void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        Node p = front;
        System.out.print("Queue elements: [");
        while (p.next != null) {
            System.out.print(p.info + ", ");
            p = p.next;
        }
        System.out.println(p.info + "]");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("*****MENU*****");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("--------------------");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    insert();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                default:
                    System.out.println("Wrong choice");
                    sc.close();
            }
        }
    }
}