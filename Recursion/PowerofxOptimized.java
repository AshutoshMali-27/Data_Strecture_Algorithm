public class PowerofxOptimized {
    
    public static void main(String args[]){

        int a=2;
        int n=10;
        System.out.println(PowerofxOptimized(a,n));
    }


    public static int PowerofxOptimized(int a,int n){


        if(n==0){
            return 1;
        }

        int halfpower=PowerofxOptimized(a,n/2);
        int halfpowersq=halfpower* halfpower;
        if(n%2 !=0){
            halfpowersq=a*halfpowersq;
        }

        return halfpowersq;
    }
}
