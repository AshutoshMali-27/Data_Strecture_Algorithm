package Recursion;

public class SumofN {
    
    public static void main(String args[]){

        int n=5;
        System.out.print(calcSum(5));

    }

    public static int calcSum(int n){
        
if(n==1){
    return 1;
}

        int sumN=calcSum(n-1);
        int Sn=n+sumN;
        return Sn;
    }
}
