import java.util.*;

class Node {
    int info;
    Node next;
    
    Node(int info) {
        this.info = info;
        this.next = null;
    }
}
public class Stack2 {
	
    public static Node top = null;
    public static Node push(Node top) {
        Scanner sc = new Scanner(System.in);
        Node p = new Node(0);
        System.out.println("Enter element to push:");
        p.info = sc.nextInt();
        p.next = top;
        top = p;
        System.out.println("Element added successfully");
        sc.close();
        return top;
    }
    public static Node pop(Node top) {
        if (top == null) {
            System.out.println("Stack Underflow. Cannot pop element.");
        } else {
            Node p = top;
            System.out.println("Popped element: " + p.info);
            top = top.next;
            System.out.println("Element removed successfully");
        }
        return top;
    }
    public static void display(Node top) {
        if (top == null) {
            System.out.println("Empty Stack");
        } else {
            System.out.println("Stack elements:");
            Node p = top;
            while (p != null) {
                System.out.println(p.info);
                p = p.next;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    top = push(top);
                    break;
                case 2:
                    top = pop(top);
                    break;
                case 3:
                    display(top);
                    break;
                default:
                    System.out.println("Invalid choice");
                    sc.close();
            }
        }
    }
}