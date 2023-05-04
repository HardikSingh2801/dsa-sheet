package Array;

import java.util.Arrays;

public class duplicate {

    public static void main(String[] args) {

        int arr[]= {4,2,6,8,4,2,1};

        System.out.println(Duplicate(arr));
        
    }

    public static boolean Duplicate(int [] arr){
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==arr[i-1]){
                return true;
            }
        }
        return false;
    }   

    
}
