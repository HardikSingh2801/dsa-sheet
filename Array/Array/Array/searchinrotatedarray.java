package Array;

public class searchinrotatedarray {

    public static int search(int arr[],int target){
        int n = arr.length;

        int left=0;
        int right=n-1;

        while(left<=right){
            int middle = (left+right)/2;

            if(arr[middle]==target){
                return middle;
            }
            else if(arr[left]<=arr[middle]){
                if(target>arr[left] && target<arr[middle]){
                    right = middle-1;
                }else{
                    left=middle+1;
                }

            }else{
                if(target>arr[middle] && target <arr[right]){
                    left=middle+1;
                }else{
                    right=middle-1;
                }
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        int arr[] = {3,4,5,7,8,4,};

        

        System.out.println(search(arr, 5));

    }
    
}
