package collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>();

        users.add("Alice");
        users.add("blice");
        users.add("clice");
        users.add("dlice");
        users.add("4");
        for(Object user:users){
            
            System.out.println(user);
        }
        
    }
    

}
