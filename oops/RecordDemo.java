package oops;


record Student(int rollno,String name,String college){}
public class RecordDemo {
    public static void main(String[] args) {
        Student s1 = new Student(21,"raxit","harivandna");
        System.out.println("rollno: "+s1.rollno());
    }
    
}
