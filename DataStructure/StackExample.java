import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();


        names.push("A");
        names.push("B");
        names.push("C");

        while (!names.isEmpty()) {
            System.out.println(names.peek());
            names.pop();
            
        }
        
    }
}
