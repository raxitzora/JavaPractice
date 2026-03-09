package oops.introduction;

import java.util.Scanner;

public class Mava {
    public static void main(String[] args) {

        Students s1 = new Students(1,"raxit","harivandana");
        Students s2 = new Students(2,"raxit1","GTU");
        Students s3 = new Students(3,"raxit2","Atmiya");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter college :");

        String name = sc.nextLine();

        if(name.equals("harivandana")){
            System.out.println(s1.rollno);
            System.out.println(s1.name);
        }
        else if(name.equals("GTU")){
            System.out.println(s2.rollno);
            System.out.println(s2.name);   
        }
        else if(name.equals("Atmiya")){
            System.out.println(s3.rollno);
            System.out.println(s3.name);
        }
        else{
            System.out.println("Student is not from our college");
        }
    }
}