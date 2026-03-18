package DSA.Algorithms.LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,5,32,6,8,4};
        int target = 1;

        int answer = linearSearch(nums, target);
        System.out.println("Element is at index of: "+answer);
        
    }
    static int linearSearch(int[]arr, int target){
        if(arr.length==0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }


            
        }
                    return -1;

    }
    
}

