public class CheckPower2orNot {
    
    public static void main(String args[]){

        System.out.println(poweroftwo(16));
    }
    public static boolean poweroftwo(int n){
        return (n &(n-1)) == 0;
    }
}
