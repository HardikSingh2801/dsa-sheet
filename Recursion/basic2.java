package Recursion;

public class basic2 {

    public static int optimizedpower(int a,int n){
        if(n==0){
            return 1;
        }
        int halfpower =optimizedpower(a, n/2);

        int halfpowersq =  halfpower*halfpower;

        if(n%2!=0){
            halfpowersq = a*halfpowersq;
        }
        return halfpowersq;
    }

    public static int tilingproblem(int n){

        if(n==0 || n==1){
            return 1;
        }

        //vertical choice

        // int fnm1 = tilingproblem(n-1);

        // //horizontal choice
        // int fnm2= tilingproblem(n-2);

        // int totalways= fnm1+fnm2;

        // return totalways;
        return tilingproblem(n-1) + tilingproblem(n-2);

    }

    public static void removeDuplicates( String str, int idx, StringBuilder nstr, boolean map[]){
        if(idx == str.length()){
            System.out.println(nstr);
            return;
        }

        char currchar = str.charAt(idx);

        if(map[currchar - 'a']== true){
            removeDuplicates(str, idx +1, nstr, map);
        }else{
            map[currchar -'a']=true;
            removeDuplicates(str, idx+1, nstr.append(currchar), map);
        }
    }

    public static int friendspair(int n){
        if(n==1|| n==2){
            return n;
        }

        //single choice
        int fnm1 = friendspair(n-1);

        //pairing choice
        int fnm2 = friendspair(n-2);
        int pairingways = (n-1) * fnm2;

        int totways = fnm1 + pairingways;
        return totways;
    
    }

    public static void binarystring(int n, int lp, String str){

        if(n==0){
            System.out.println(str);
            return;
        }
        binarystring(n-1, 0, str + "0");
        if(lp==0){
            binarystring(n-1, 1, str + "1");

        }
    }
    public static void main(String[] args) {
        // System.out.println(optimizedpower(2, 5));
        // System.out.println(tilingproblem(4));

        String str = "appnacolllegggeeeeee";
        removeDuplicates(str, 0, new StringBuilder(" "), new boolean[26]);

        // System.out.println(friendspair(3 ));

        // binarystring(3, 0, " ");
        
    }
    
}
