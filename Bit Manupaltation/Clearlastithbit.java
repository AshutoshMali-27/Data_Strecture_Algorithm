public class Clearlastithbit {

    public static void main(String args[]){
System.out.println(clearlastithbit(15, 2));
    }

    public static int clearlastithbit(int n,int i){
        int bitmask=(~0)<<i;
        return n& bitmask;

    }
    
}