package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Practice {
    public static void main(String[] args) {

        List<String> lis = new ArrayList<>();

        List<Integer> num = new LinkedList<>();

        num.add(10);
        num.add(20);
        num.add(30);


        Set<String> na = new HashSet<>();

        na.add("ra");
        na.add("rax");
        na.add("raxi");

        Set<Integer> nums = new LinkedHashSet<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);

        System.out.println(nums);

        Set<String> names = new HashSet<>();

        Set<Integer> numbers = new TreeSet<>();

        numbers.add(40);
        numbers.add(20);
        numbers.add(30);
    
        for(int a:numbers){
            System.out.println(a);
        }



        





    }
}
