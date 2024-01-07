import java.util.Scanner;

public class CheckPrimeOptimized {
    
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

System.out.println(isPrime(n));
          
    }

    public static boolean isPrime(int n){

        boolean isPrime=true;


        if(n==2){
            isPrime=true;
        }
        else{

for(int i=2;i<=Math.sqrt(n);i++){

            if(n%i==0){
                isPrime=false;
                break;
            }
        }


        }
return isPrime;
        

    }
}
