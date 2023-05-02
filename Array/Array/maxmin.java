package Array;

public class maxmin {

    public static void main(String[] args) {

        int arr[] = {22,33,21,45,42,32,12};

        maxomin(arr);
    
    }

    public static void maxomin(int arr[]){

        int max= arr[0];
        int min = arr[0];

        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }

            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
    
}
