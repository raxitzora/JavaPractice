package collections;

import java.util.HashSet;
import java.util.Set;

public class SetsDemo {
    public static void main(String[] args) {
        Set<String> roles = new HashSet<>();
        roles.add("hello");
        roles.add("jello");

        for(String role:roles){
            System.out.println(role);
        }
    }

    
}
