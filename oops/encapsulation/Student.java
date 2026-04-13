package oops.encapsulation;

public class Student {
    
    private int accountNumber;
    private int rollno;

    public int getAccountNumber(){
        return accountNumber;
    } 

    public void setAccoutNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getrollno(){
        return rollno;
    }

    public void setRollno(int rollno){
        this.rollno = rollno;
    }


    public static void main(String[] args) {
        Student s = new Student();
        s.setAccoutNumber(12000);
        System.out.println(s.getAccountNumber());

        Student s1 = new Student();
        s1.setRollno(52);
        System.out.println(s1.getrollno());

    }
    
}

