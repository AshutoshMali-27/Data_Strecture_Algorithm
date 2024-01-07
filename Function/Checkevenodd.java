import java.util.Scanner;

public class Checkevenodd {
    
    public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

System.out.println(isEven(n));
    }



    public static boolean isEven( int n){

        boolean isEven =true;
    
        if(n%2 != 0){
            isEven=false;
            
        }

        return isEven;

    }
}
