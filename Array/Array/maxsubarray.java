package Array;

public class maxsubarray {
    public static void main(String[] args) {

      int arr[] = {5,6,3,-6,9,11,7};

      int max=0;

      int sum=0;

      for(int i=0;i<arr.length-1;i++){
        if(arr[i]<0){
            sum=0;
            i++;
        }

        sum+=arr[i];
        if(max<sum){
            max=sum;
        }
      }
      System.out.println(max);
    }
    
}
