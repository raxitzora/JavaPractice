import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.addFirst(22);




        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(4);
        numbers.add(3);
        numbers.addFirst(11);
        numbers.addLast(22);

        numbers.push(333);
        numbers.pop();

      
        

        System.out.println(numbers);
    }
}
