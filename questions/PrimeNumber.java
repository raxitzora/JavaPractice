package questions;

import java.util.Scanner;

public class PrimeNumber {

    static boolean isPrime(int n){
        if(n%2==0){
            return false;
        }
        else{
            return true;
            
        }

    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = sc.nextInt();

        boolean ans = isPrime(number);
        System.out.println(ans);

     
    }
    
}
