package miniproject;

import java.util.HashSet;
import java.util.Set;

public class User {
    private String name;
    private boolean active;
    private Set<String> roles;

    //costructor

    public User(String name,boolean active,Set<String> roles){
        this.name = name;
        this.active = active;
        this.roles = roles;
    }

    //getters
    public boolean isActive(){
        return active;
    }
    public String getName(){
        return name;
    }
    public Set<String> getRoles(){
        return roles;
    }
}
