public class Main{
    public static void main(String[] args) {

        int arr[] = {7,5,912312,8,2};

    int maxelement =arr[0];
    int maxindex = 0;

    for(int i=0;i<arr.length;i++){
        if(arr[i]>maxelement){
            maxelement = arr[i];
            maxindex = i;
        }
    }
    System.out.println("Max element: "+maxelement);
    System.out.println("Max index"+maxindex);


    

    }
}