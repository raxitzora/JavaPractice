import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int[] nums = {1,2,3,4,5,6,6,7,8,9,10};

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        for (int i : nums) {
            System.out.println(i);
            
        }
    }   
}
