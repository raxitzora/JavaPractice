import java.util.Stack;

public class StacksExample {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();

        books.push("java");
        books.push("python");
        books.push("c++");

        
        books.pop();

        System.out.println(books);
    }
}
