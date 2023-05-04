package Array;

public class kadans {

    public static void kadan(int arr[]){
        int cs=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){
            cs+=arr[i];
            if(cs<0){
                cs=0;
            }
            maxsum=Math.max(maxsum, cs);
        }
        System.out.println("Max sum is "+ maxsum);
    }

    public static void main(String[] args) {
        int arr[]= {2,5,6,-2,5,6,2,9,-8};

        kadan(arr);
    }
    
}
