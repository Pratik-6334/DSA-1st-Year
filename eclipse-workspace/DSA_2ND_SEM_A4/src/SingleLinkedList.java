import java.util.*;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
}
public class SingleLinkedList
 {
    public static Node start = null;
    public static Node create(Node start) 
    {
        Scanner sc = new Scanner(System.in);
        Node q = null;
        char ch;
        do {
            Node p = new Node();
            System.out.println("Enter the registration number:");
            p.regd_no = sc.nextInt();
            System.out.println("Enter your marks:");
            p.mark = sc.nextFloat();
            p.next = null; // ensure the next pointer is null
            if (start == null) {
                start = p;
                q = p;
            } 
            else {
                q.next = p;
                q = p;
            }
            System.out.println("Do you want to create another node in the linked list? (Y/N)");
            ch = sc.next().charAt(0);
            sc.close();
        } 
        while (ch == 'y' || ch == 'Y');
        return start;
    }
    public static void display(Node start) {
        Node p = start;
        if (start == null) {
            System.out.println("Empty LinkedList");
        } 
        else {
            System.out.println("Registration no\tMarks");
            while (p != null) {
                System.out.println(p.regd_no + "\t\t" + p.mark);
                p = p.next;
            }
        }
    }
    public static Node InsBeg(Node start) {
        Scanner sc = new Scanner(System.in);
        Node p = new Node();
        System.out.println("Enter the registration number:");
        p.regd_no = sc.nextInt();
        System.out.println("Enter your marks:");
        p.mark = sc.nextFloat();
        p.next = start;
        start = p;
        return start;
    }
    public static Node InsEnd(Node start) {
        Scanner sc = new Scanner(System.in);
        Node p = new Node();
        System.out.println("Enter the registration number:");
        p.regd_no = sc.nextInt();
        System.out.println("Enter your marks:");
        p.mark = sc.nextFloat();
        p.next = null;
        
        if (start == null) {
            start = p;
        }
        else {
            Node q = start;
            while (q.next != null) {
                q = q.next;
            }
            q.next = p;
        }
        return start;
    }
    public static Node InsAny(Node start) {
        Scanner sc = new Scanner(System.in);
        Node p = new Node();
        System.out.println("Enter the registration number:");
        p.regd_no = sc.nextInt();
        System.out.println("Enter your marks:");
        p.mark = sc.nextFloat();
        System.out.println("Enter position of new Node:");
        int pos = sc.nextInt();
        
        if (pos <= 0) {
            System.out.println("Position does not exist");
        } 
        else if (start == null || pos == 1) {
            p.next = start;
            start = p;
            System.out.println("Node added at first position");
        } 
        else {
            Node q = start;
            for (int i = 1; i < pos - 1 && q.next != null; i++) {
               q = q.next;
            }
            if (q.next == null) {
                q.next = p;
                p.next = null;
                System.out.println("Position not found, so new Node is added to last:");           
            } 
            else {
                p.next = q.next;
                q.next = p;
                System.out.println("New Node added to position " + pos);
            }
        }
        return start;
    }
    public static Node DelBeg(Node start) {
        if (start == null) {
            System.out.println("Empty LinkedList");
        } 
        else {
            start = start.next;
            System.out.println("Node Deleted");
        }
        return start;
    }
    public static Node DelEnd(Node start) {
        if (start == null) {
            System.out.println("Empty LinkedList");
        } else if (start.next == null) { // if there's only one element
            start = null;
            System.out.println("Last Node deleted");
        } else {
            Node p = start;
            Node q = null;

            while (p.next != null) {
                q = p;
                p = p.next;
            }
            q.next = null;
            System.out.println("Last Node deleted");
        }
        return start;
    }
    public static Node DelAny(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position you want to delete: ");
        int pos = sc.nextInt();
        
        if (start == null) {
            System.out.println("Empty LinkedList");
        } 
        else if (pos == 1) {
            start = start.next;
            System.out.println("Node is deleted");
        } 
        else {
            Node p = start;
            for (int i = 1; i < pos - 1 && p != null; i++) {
                p = p.next;
            }
            if (p != null && p.next != null) {
                p.next = p.next.next;
                System.out.println("Node is deleted");
            } 
            else {
                System.out.println("Position out of range");
            }
        }
        return start;
    }
    public static Node DelByRegdNo(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter registration number to delete: ");
        int regd_no = sc.nextInt();

        if (start == null) {
            System.out.println("List is empty");
        }
        else if (start.regd_no == regd_no) {
            start = start.next;
            System.out.println("Node is Deleted ");
        } 
        else {
            Node temp = start;
            while (temp.next != null && temp.next.regd_no != regd_no) {
                temp = temp.next;
                System.out.println("Node is Deleted ");
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
                System.out.println("Node is Deleted ");
            } 
            else {
                System.out.println("Registration number not found");
            }
        }
        return start;
    }
    public static void search(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Registration No: ");
        int regNo = sc.nextInt();
        
        if (start == null) {
            System.out.println("Empty linkedList");
        }
        else {
            Node p = start;
            boolean found = false;

            while (p != null) {
                if (p.regd_no == regNo) {
                    System.out.println("Registration Found, Enter the updated Marks: ");
                    p.mark = sc.nextFloat();
                    found = true;
                    break;
                }
                p = p.next;
            }
            if (found) {
                System.out.println("Marks updated!");
            }
            else {
                System.out.println("Registration number not found.");
            }
        }
    }
    public static int count(Node start) {
        int c = 0;
        Node p = start;
        while (p != null) {
            c++;
            p = p.next;
        }
        return c;
    }
    public static Node reverse(Node start) {
        Node prev = null, current = start, next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        start = prev;
        System.out.println("Linked list reversed.");
        return start;
    }
    public static void sort(Node start) {
        if (start == null) {
            System.out.println("Empty linked list");
            return;
        }
        Node m = start;
        while (m.next != null) {
            Node q = start;
            while (q.next != null) {
                Node p = q.next;
                if (q.mark > p.mark) {
                    // Swap registration numbers
                    int reg = q.regd_no;
                    q.regd_no = p.regd_no;
                    p.regd_no = reg;
                    // Swap marks
                    float mark = q.mark;
                    q.mark = p.mark;
                    p.mark = mark;
                }
                q = q.next;
            }
            m = m.next;
        }
        System.out.println("Linked list sorted based on marks.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Node start = null;
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("0: Exit");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Insert at Beginning");
            System.out.println("4. Insert at End");
            System.out.println("5. Insert at Any Position");
            System.out.println("6. Delete from Beginning");
            System.out.println("7. Delete from End");
            System.out.println("8. Delete from Any Position");
            System.out.println("9. Delete by Registration Number");
            System.out.println("10. Search and Update by Registration Number");
            System.out.println("11. Count Nodes in the Linked List");
            System.out.println("12. Sort the Linked List based on Marks");
            System.out.println("13. Reverse the Linked List");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    start = create(start);
                    break;
                case 2:
                    display(start);
                    break;
                case 3:
                    start = InsBeg(start);
                    break;
                case 4:
                    start = InsEnd(start);
                    break;
                case 5:
                    start = InsAny(start);
                    break;
                case 6:
                    start = DelBeg(start);
                    break;
                case 7:
                    start = DelEnd(start);
                    break;
                case 8:
                    start = DelAny(start);
                    break;
                case 9:
                	start=DelByRegdNo(start);
                	break;
                case 10:
                    search(start);
                    break;
                case 11:
                    System.out.println("Number of nodes: " + count(start));
                    break;
                case 12:
                    sort(start);
                    break;
                case 13:
                    start = reverse(start);
                    break;
                default:
                    System.out.println("Wrong Choice");
                    sc.close();
            }
        }
    }
}