package DSA.Algorithms.LinearSearch;

public class Prac {
    public static void main(String[] args) {
        int[] numbers = {2,4,6,3,753,74,2};
        int target = 74;

        int ans = LinearSearchh(numbers,target);
    System.out.println("Element is at index of: "+ans);
    }


    

    static int LinearSearchh(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i =0;i<=arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;

    }
}
