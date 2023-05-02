package Array;

public class array {

    public static void main(String[] args) {
        
        int arr[] = {2,4,6,7,8,10};

        reversearr(arr);

        
    }

    public static void reversearr(int arr[]) {

        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+ " ");
        
        }

    }
        
    

    
}
