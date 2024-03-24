
//1.check isprime
//2.check isprime optimized
//3 prime no range
//4.binary to decimal converter
import java.util.Scanner;

public class Javatutorialfunctionandarray {
    
    public static void main(String args[]){

       // isPrime(n);
      // Scanner sc=new Scanner(System.in);
       //int n=sc.nextInt();
      // System.out.println(isPrime(n));
      
      primerange(100);

   //  System.out.print(isPrimeotimized(n)); 
    }

    public static boolean isPrime(int n){
        boolean isPrime=true;
        if(n==2){
            isPrime=true;
        }
        else{
            for(int i=2;i<=n-1;i++){
                if(n%i==0){
                    isPrime=false;
                }
            }
            
        }
        return isPrime;
    }

    public static boolean isPrimeotimized(int n){
        boolean isPrimeotimized=true;

        if(n==2){
            isPrimeotimized=true;
        }
        else{

            for(int i=2;i<Math.sqrt(n);i++){
                if(n%i==0){
                    isPrimeotimized=false;
                }
                break;
            }
        }
        return isPrimeotimized;
    }
    public static void primerange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
            System.out.print("");
        }
    

    }


    public static void binarytodecimal(int n){
        int pow=0;
        int decnum=0;

        while(n>0){
            int lastdigit=n%10;
            
        }

    }
}
