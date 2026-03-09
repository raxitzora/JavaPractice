package CollectionsExercises;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

public static void main(String[] args) {
    Map<String,Integer> ages = new HashMap<>();

    ages.put("raxit", 21);

    System.out.println(ages.get("raxit"));
}
}
