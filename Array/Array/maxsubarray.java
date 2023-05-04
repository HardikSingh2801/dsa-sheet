public class maxsubarray {

    public static int maxofsub(int arr[]){

        int maxsf= arr[0];
        int maxed = arr[0];

        for(int i=1;i<arr.length;i++){
          maxed= Math.max(maxed + arr[i], i);
          maxsf= Math.max(maxsf,maxed);
        }
        return maxsf;
    }

    public static void main(String[] args) {
        int[] arr= {3,4,2,3,-3,2,3,5};

        System.out.println(maxofsub(arr));
        
    }
    
}
