import java.lang.reflect.Array;
public class Arrays {
    
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};


        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        int[] arr2 = new int[10];

        java.util.Arrays.fill(arr2,40);
        
    }
}
