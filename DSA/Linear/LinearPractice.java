package DSA.Linear;

public class LinearPractice {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7};
        int target = 5;

        int result = linearSearch(numbers, target);
        if(result!=-1){
            System.out.println("Found at "+result);
        }
        else{
            System.out.println("Not found");
        }


        
    }

    static int linearSearch(int[]numbers, int target){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==target) {
                return i;
            }
        }
        return -1;
    }
}