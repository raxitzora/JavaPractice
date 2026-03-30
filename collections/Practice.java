package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

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

        for (String name : na) {
            System.out.println(name);
        }
        





    }
}
