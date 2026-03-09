package miniproject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import miniproject.User;
import java.util.Set;

public class UserManagementDemo {
    public static void main(String[] args) {
        Set<String> user1Roles = new HashSet<>(Arrays.asList("ADMIN","USER"));
        User user1 = new User("alice",true,user1Roles);
        List <User> users = new ArrayList<>();

        users.add(user1);
    }
}
