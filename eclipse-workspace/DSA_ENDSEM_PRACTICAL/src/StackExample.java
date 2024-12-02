public class StackExample {
    private int maxSize; // size of stack array
    private int[] stackArray;
    private int top; // top of stack

    // Constructor to initialize stack
    public StackExample(int size) {
        maxSize = size; // set array size
        stackArray = new int[maxSize]; // create array
        top = -1; // no items yet
    }

    // Method to push element onto stack
    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value; // increment top, insert item
            System.out.println("Pushed " + value + " onto stack");
        } else {
            System.out.println("Stack is full, cannot push " + value);
        }
    }

    // Method to pop element from stack
    public int pop() {
        if (top >= 0) {
            int value = stackArray[top--]; // access item, decrement top
            System.out.println("Popped " + value + " from stack");
            return value;
        } else {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
    }

    // Method to display stack contents
    public void display() {
        if (top >= 0) {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty");
        }
    }

    public static void main(String[] args) {
        StackExample stack = new StackExample(5); // Create a stack of size 5

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // Display: 10 20 30

        stack.pop(); // Pop: 30
        stack.display(); // Display: 10 20

        stack.push(40);
        stack.push(50);
        stack.push(60); // This will exceed the stack size and print an error message
    }
}