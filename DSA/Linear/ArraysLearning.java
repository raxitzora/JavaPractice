package DSA.Linear;

public class ArraysLearning {
    public static void main(String[] args) {
        

        //total sum of array

     int[] arr = {3, 9, 2, 15, 6};

     int max = arr[0];

     for(int i=1;i<arr.length;i++){
        if(arr[i]>max){
            max = arr[i];
        }
     }

     System.out.println("Maximum element is :"+max);



        // int sum = 0;
    
        // for(int i =0;i<arr.length;i++){
        // sum = sum + arr[i];
        // }
        // System.out.println("Total sum is "+sum);    
        // simple loop
        // for(int i =0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }

        //Sum of numbers
        // int sum = 0;
        // for(int i =0;i<arr.length;i++){
        //     sum = sum + arr[i];
        // }
        // System.out.println(sum);
        

        //Searching
        // int target = 6;
        // for(int i = 0;i<arr.length;i++){
        //     if(arr[i]==target){
        //         System.out.println("Found at index"+i);
        //     }
        // }



    
      
    }
}
