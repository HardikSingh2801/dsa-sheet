package Array;

public class reversearray {

    public static void main(String[] args) {
        int arr[]={33,23,45,57,67,76};
        //using while loop

        /*int temp;
        int start=0;
        int end= arr.length-1;

        while(start<end){
            temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
        int i=0;
        while(i<arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
        */

        /*for(int i=arr.length-1; i>=0;i--){
            System.out.print(arr[i] + " ");
        }*/  

        
        ra(arr, 0);
        
    }
     public static void ra(int arr[], int i){

        if(i==arr.length){
            return;
        }
        ra(arr,i+1);
        System.out.print(arr[i]+ " ");
    }
    
}
