import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
public class Arrays {

    public static void f1(){
        int [] n = {2,5,3,6,7,4,2,5,7,2,1};
        java.util.Arrays.sort(n);
        System.out.println(java.util.Arrays.toString(n));
    }

    public static void f2(){
        String[] fruits = {"apple","orange","mango","banana"};
        java.util.Arrays.sort(fruits);
        System.out.println(java.util.Arrays.toString(fruits));
    }
    
    public static void main(String[] args) {
        // int [] arr = {1,2,3,4,5};


        // for(int i:arr){
        //     System.out.println(i);
        // }


        // Scanner sc = new Scanner(System.in);

        // int N = sc.nextInt();

        // int[] arr = new int[N];

        // for(int i =0;i<N;i++){
        //     arr[i] = sc.nextInt();
        // }


        // for(int i =0;i<=arr.length;i++){
        //     System.out.println(arr[i]);
        // }

    //    for(int i=0;i<arr.length;i++){
    //     System.out.println(arr[i]);
    //    }

    // String[] names = {"a","b","c"};

    // for(int i=0;i<=names.length;i++){
    //     System.out.println(names[i]);
    // }

    f1();
    f2();

    String s1 ="abc";
    String s2 = "abe";


    System.out.println(s1.compareTo(s2));

    Collection<String> nam = new ArrayList<>();
    nam.add("raxit");

    Collection<String> name = new HashSet<>();

    
    name.add("raxitzora");

    




        


        
        
    }
}
