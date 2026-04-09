package CollectionsExercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class AllOps {

    public static void main(String[] args) {

        //Array Lists
        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(1,20);

        list.get(0);
        list.set(0,50 );
        list.remove(0);
        list.remove(Integer.valueOf(20));
        list.size();

        for(Integer a:list){
            System.out.println(a);
        }

        //Hash Sets
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.remove(10);
        boolean is = set.contains(20);
        Integer a = set.size();
        System.out.println(a);


            //Hash Maps

        Map<String,Integer> maping = new HashMap<>();

        maping.put("A",10);
         maping.get("A");

        
    }

    
    
}
