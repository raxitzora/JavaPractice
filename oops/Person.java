package oops;

public class Person{
    int rollno;
    String name;

    Person(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    public void showName(String name, int rollno){
        System.out.println("Name is"+name);
    }

    public static void main(String[] args) {
        Person p1 = new Person(42,"raxt");
        p1.showName("rax",2);
    }
}