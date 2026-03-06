 package Exercise;


class Student{
    int rollno;
    String name;

    public Student(int rollno,String name){
        this.rollno = rollno;
        this.name = name;
    }
}


public class Car {
    public static void main(String[] args) {
        Student s1 = new Student(21,"raxit");

        System.out.println(s1.name);
        System.out.println(s1.rollno);


    }

    
}