package oops.introduction;

class BankAccount {
    int balance;

    BankAccount(int balance){
        if(balance<0){
            throw new IllegalArgumentException("Negative number");
        }
        this.balance = balance;
    }
}


class Student{
    int rollno;
    String name;
    String college;
}


class Car{
    int seatno;
    String color;
    
}
public class Practiceoops {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "raxit";

        Car c1 = new Car();
        c1.color = "red";

        BankAccount b1 = new BankAccount(0);

        System.out.println(b1.balance);
    }
    
}
