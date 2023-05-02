package Recursion;

public class basic {

     public static void decreasingnum(int n) {
        if( n==1){
            System.out.println(n);
            return;
        }

        System.out.print(n + " ");
        decreasingnum(n-1);
        
    }

    public static void increasingnum(int n) {
        if( n==1){
            System.out.print(n + " ");
            return;
        }

        increasingnum(n-1);
        System.out.print(n + " ");
        
    }

    public static int fact(int n){
        if(n==0){       
            return 1;

        }
        
        int fnm= fact(n-1);
        int fn = n*fnm;
        return fn;
    }
//printing natural sum
    public static int naturalsum(int n){
        if(n==1){
            return 1        ;
        }

        int smn= naturalsum(n-1);
        int sum= n+smn;
        return sum;
    }
    //printing fibbonaci
    public static int fibbonaci(int n){

        if(n==0||n==1){
            return n;
        }

        int fnm1= fibbonaci(n-1);
        int fnm2= fibbonaci(n-2);
        int fn= fnm1+fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[],int i) {
        if(i==arr.length-1){
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }

        return isSorted(arr,i+1);
        
    }
    
    public static int firstoccir(int arr[],int key,int i){

        if(i==arr.length){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }

        return firstoccir(arr, key, i+1);
    }

    public static int lasttoccir(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }

        int isfound = lasttoccir(arr, key, i+1);

        if(isfound ==-1 &&arr[i]==key){
            return i;
        }

        return isfound;

    }

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }

        // int xnm1= power(x, n-1);
        // int xn= x *xnm1;
        // return xn;

        return x*power(x,n-1);
    }
    public static void main(String[] args) {

       //c int n=22;
        // decreasingnum(n);
        // increasingnum(n);
        // System.out.println(fact(n));
        // System.out.println(naturalsum(n));
       // System.out.println(naturalsum(n));
        // System.out.println(fibbonaci(n));
        // System.out.println(isSorted(arr, 0));
        // int arr[]= {8,3,9,5,10,2,5,3};
        // System.out.println(firstoccir(arr, 4, 0));
        // System.out.println(lasttoccir(arr, 5, 0));

        System.out.println( power(2, 10));



    }
}
