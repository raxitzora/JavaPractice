package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        //Array list
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        // System.out.println(list.get(1));

        //Linked List
        List<Integer> link = new LinkedList<>();

        link.add(1);
        link.add(2);
        link.add(3);
        link.add(1,100);



        //methods
        List<String> names = new ArrayList<>();

        names.add("A");
        names.add(1,"B");
        names.get(0);
        names.set(0,"Z");
        names.remove(1);
        names.contains("Z");
        names.size();
        }

        
        
        
    }
    
