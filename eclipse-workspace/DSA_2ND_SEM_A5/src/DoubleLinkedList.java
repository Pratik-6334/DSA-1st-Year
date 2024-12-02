import java.util.Scanner;
class Node {

    protected int regd_no;
    protected float mark;
    protected Node next;
    protected Node prev;
}
public class DoubleLinkedList {
    private static Node start = null;
    private static Node end = null;
    public static Node create() {
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            Node p = new Node();
            System.out.println("Enter the registration number:");
            p.regd_no = sc.nextInt();
            System.out.println("Enter your marks:");
            p.mark = sc.nextFloat();
            p.next = null;
            p.prev = null;
            if (start == null) {
                start = p;
                end = p;
            } else {
                end.next = p;
                p.prev = end;
                end = p;
            }
            System.out.println("Do you want to create another node in the linked list? (Y/N)");
            ch = sc.next().charAt(0);
        } 
        while (ch == 'y' || ch == 'Y');
        return end;
    }
    public static void display() {
        if (start == null) {
            System.out.println("Empty LinkedList");
        } else {
            System.out.println("Registration no\tMarks");
            Node p = start;
            while (p != null) {
                System.out.println(p.regd_no + "\t\t" + p.mark);
                p = p.next;
            }
        }
    }
    public static Node insBeg() {
        Scanner sc = new Scanner(System.in);
        Node p = new Node();
        System.out.println("Enter the registration number:");
        p.regd_no = sc.nextInt();
        System.out.println("Enter your marks:");
        p.mark = sc.nextFloat();
        p.next = start;
        p.prev = null;
        if (start != null) {
            start.prev = p;
        } else {
            end = p;
        }
        start = p;
        System.out.println("Node added at the beginning.");
        return start;
    }
    public static Node insEnd() {
        Scanner sc = new Scanner(System.in);
        Node p = new Node();
        System.out.println("Enter the registration number:");
        p.regd_no = sc.nextInt();
        System.out.println("Enter your marks:");
        p.mark = sc.nextFloat();
        p.next = null;
        p.prev = end;
        if (end != null) {
            end.next = p;
        } else {
            start = p;
        }
        end = p;
        System.out.println("Node added at the end.");
        return end;
    }
    public static Node insAny() {
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
        } else if (start == null || pos == 1) {
            p.next = start;
            p.prev = null;
            if (start != null) {
                start.prev = p;
            } else {
                end = p;
            }
            start = p;
            System.out.println("Node added at first position");
        } else {
            Node q = start;
            for (int i = 1; i < pos - 1 && q.next != null; i++) {
                q = q.next;
            }
            if (q.next == null) {
                q.next = p;
                p.prev = q;
                p.next = null;
                end = p;
                System.out.println("Position not found, so new Node is added to last");
            } else {
            	p.next = q.next;
                p.prev = q;
                q.next.prev = p;
                q.next = p;
                System.out.println("New Node added to position " + pos);
            }
        }
        return start;
    }
    public static Node delBeg() {
        if (start == null) {
            System.out.println("Empty LinkedList");
        } else {
            start = start.next;
            if (start != null) {
                start.prev = null;
            } else {
                end = null;
            }
            System.out.println("Node deleted from the beginning");
        }
        return start;
    }
    public static Node delEnd() {
        if (start == null) {
            System.out.println("Empty LinkedList");
        } else if (start.next == null) {
            start = null;
            end = null;
            System.out.println("Last Node deleted");
        } else {
            end = end.prev;
            end.next = null;
            System.out.println("Last Node deleted");
        }
        return start;
    }
    public static Node delAny() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position you want to delete: ");
        int pos = sc.nextInt();
        if (start == null) {
            System.out.println("Empty LinkedList");
        } else if (pos == 1) {
            start = delBeg();
        } else {
            Node p = start;
            for (int i = 1; i < pos - 1 && p != null; i++) {
                p = p.next;
            }
            if (p != null && p.next != null) {
                p.next = p.next.next;
                if (p.next != null) {
                    p.next.prev = p;
                } else {
                    end = p;
                }
                System.out.println("Node deleted from position " + pos);
            } else {
                System.out.println("Position out of range");
            }
        }
        return start;
    }
    public static void search() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Registration No: ");
        int regNo = sc.nextInt();
        if (start == null) {
            System.out.println("Empty linkedList");
        } else {
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
    public static int count() {
        int c = 0;
        Node p = start;
        while (p != null) {
            c++;
            p = p.next;
        }
        return c;
    }
    public static Node reverse() {
        Node temp = null;
        Node current = start;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            start = temp.prev;
        }
        System.out.println("Linked list reversed.");
        return start;
    }
    public static void sort() {
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
        while (true) 
        {
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
            System.out.println("9. Search and Update by Registration Number");
            System.out.println("10. Count Nodes in the Linked List");
            System.out.println("11. Sort the Linked List based on Marks");
            System.out.println("12. Reverse the Linked List");
            System.out.println("Enter your choice:");
            
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    end = create();
                    if (start == null) {
                        start = end;
                    }
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    start = insBeg();
                    break;
                case 4:
                    end = insEnd();
                    if (start == null) {
                        start = end;
                    }
                    break;
                case 5:
                    start = insAny();
                    break;
                case 6:
                    start = delBeg();
                    if (start == null) {
                        end = null;
                    }
                    break;
                case 7:
                    start = delEnd();
                    if (start == null) {
                        end = null;
                    }
                    break;
                case 8:
                    start = delAny();
                    if (start == null) {
                        end = null;
                    }
                    break;
                case 9:
                    search();
                    break;
                case 10:
                    System.out.println("Number of nodes: " + count());
                    break;
                case 11:
                    sort();
                    break;
                case 12:
                    start = reverse();
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        }
    }
}