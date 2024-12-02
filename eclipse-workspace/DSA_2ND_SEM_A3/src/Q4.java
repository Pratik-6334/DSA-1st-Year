class Box<T> {
    public T content;

    public Box(T content) {
        this.content = content;
    }
    public T getContent() {
        return content;
    }
    public void setContent(T content) {
        this.content = content;
    }
}
public class Q4 {
    public static void main(String[] args) {
        // Create a boxed String object

        Box<String> stringBox = new Box<>("Hello, World!");
        // Create two variables that refer to the same string box
        Box<String> variable1 = stringBox;
        Box<String> variable2 = stringBox;
        // Change the contents of one variable
        variable1.setContent("Modified content");
        // Verify the effect on the other variable
        System.out.println("Variable 2 content: " + variable2.getContent());
        // Create a boxed Integer object
        Box<Integer> intBox = new Box<>(42);
        // Create two variables that refer to the same integer box
        Box<Integer> intVariable1 = intBox;
        Box<Integer> intVariable2 = intBox;
        // Change the contents of one variable
        intVariable1.setContent(99);
        // Verify the effect on the other variable
        System.out.println("Int variable 2 content: " + intVariable2.getContent());
        // Create a boxed Object object
        Box<Object> objectBox = new Box<>(null);
        // Put a string in the object box
        objectBox.setContent("This is a string");
        // Verify the content
        System.out.println("Object box content (String): " + objectBox.getContent());
        // Put an integer in the object box
        objectBox.setContent(123);
        // Verify the content
        System.out.println("Object box content (Integer): " + objectBox.getContent());
    }
}