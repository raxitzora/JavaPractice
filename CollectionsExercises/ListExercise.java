
package CollectionsExercises;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class ListExercise{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.set(1,2);

        List<String> users = new ArrayList<>();
        users.add("raxit");
        users.add("amit");
        users.add("bob");
        users.remove("raxit");
        boolean t = users.contains("raxit");
        // System.out.println(t);


        List<Integer> linked = new LinkedList<>();

        linked.add(10);
        linked.add(20);


        Set<Integer> set = new HashSet<>();
        set.add(3);

        Map<String,Integer> map = new HashMap<>();

        map.putAll(null);


     
       
    }

    

}