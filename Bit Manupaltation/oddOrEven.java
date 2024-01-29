public class oddOrEven {
    
    public static void main(String args[]){

     oddOrEven(3);
     oddOrEven(11);
     oddOrEven(12);
     oddOrEven(14);
    }

    public  static void oddOrEven(int n){
        int bitMask=1;
        if((n & bitMask) ==0){
            System.out.println("even Number");
        }
        else{
            System.out.println("odd number");
        }
    }
}
