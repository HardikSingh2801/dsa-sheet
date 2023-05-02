package Array;

public class tr {

    public static void main(String[] args) {
      
        
        int height[] = {2,3,4,3,8,5,3,3,8};

        System.out.println(traprain(height));
    }
    
    public  static int traprain(int height[]) {

        int n = height.length;

        //leftmax

        int [] leftmax= new int[n];

      
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }

        //rightmax
        int rightmax[] = new int[n];

        rightmax[n-1]= height[n-1];

        for(int i=n-2;i>0;i--){
            rightmax[i]= Math.max(rightmax[i+1],height[i]);
        }

        int trappedWater= 0;

        for(int i=0;i<n;i++){
            trappedWater+= Math.min(leftmax[i],rightmax[i]) -height[i];
        }
        return trappedWater;
    }
}
