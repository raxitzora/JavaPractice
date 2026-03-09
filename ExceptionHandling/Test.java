package ExceptionHandling;

public class Test {
    public static void main(String[] args) {
        try{
            int a= 10;
            int b = 0;

            int c = a/b;

            System.out.println(c);
        } catch (ArithmeticException e){
            System.out.println("Cant be divided by 0");
        }

        System.out.println("Welcome to team");
    }
}
