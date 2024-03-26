
//1.check isprime
//2.check isprime optimized
//3 prime no range
//4.binary to decimal converter
//5.Decimal To binary Converter
//6.iseven or not
import java.util.Scanner;

public class Javatutorialfunctionandarray {
    
    public static void main(String args[]){

       // isPrime(n);
      // Scanner sc=new Scanner(System.in);
       //int n=sc.nextInt();
      // System.out.println(isPrime(n));
      
   //   primerange(100);

   //  System.out.print(isPrimeotimized(n)); 
   //binarytodecimal(1101);
  // decimaltobinary(10);


//    Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
   
  // binarytodecimal(n);
  
 // System.out.println(iseven(5));
 System.out.println(ispalindrome(131));
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

    public static  void binarytodecimal(int n){

        //1101
//decimal=1*2^3+1*2^2+0*2^1+1*2^0
int decimal=0;
int pow=0;
while(n>0){
    int ld=n%10;
    decimal=decimal+(ld*(int)Math.pow(2, pow));
    n=n/10;
    pow++;

}
System.out.println(decimal);



    }

    public static void decimaltobinary(int n){

        int mynum=0;
        int pow=0;
        int binnum=0;
        while(n>0){
            int rem=n%2;
            binnum=binnum+rem*(int)Math.pow(10, pow);
            n=n/2;

            pow++;
        }
        System.out.println(binnum);

    }

    public static boolean iseven(int n){
        boolean iseven=true;
        if(n%2 !=0){
            iseven=false;
        }
        return iseven;
    }
  
    public static boolean ispalindrome(int n){

        int palindrome=n;
        int reverse=0;
        while(palindrome !=0){
            int rem=palindrome %10;
            reverse=reverse*10+rem;
            palindrome=palindrome/10;
            
          

        }
        if(n==reverse){

            return true;
        }
        return false;
    }
}
