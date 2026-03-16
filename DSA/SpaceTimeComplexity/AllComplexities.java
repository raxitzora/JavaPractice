package DSA.SpaceTimeComplexity;

public class AllComplexities {
    public static void main(String[] args) {

        
        //O(1) constant time = Input size बढ़े या घटे, operation same रहता है.
        int[] arr = {1,2,3,4,5};
        

        //O(n) Linear time = Input size jitna bada, loop utni baar chalega.
        int[] arr2 = {1,2,3,4,5};
        for(int i=1;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

        //O(n^2) Quadratic time = Do nested loops.
        int n =5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(i+j);
            }
        }



        //O(n^3) Cubic time = Teen nested loops.
         int h = 5;
        for(int i = 0; i < n; i++){

            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++){
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }




        
    }
}
