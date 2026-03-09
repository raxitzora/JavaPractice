package CollectionsExercises;

import java.util.HashSet;
import java.util.Set;

public class SetsExample {
    public static void main(String[] args) {
        Set<String> users = new HashSet<>();

        users.add("Raxit");
        users.add("John");
        users.add("Raxit");

        System.out.println(users);
    }
}
