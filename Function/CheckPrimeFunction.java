import java.util.Scanner;

public class CheckPrimeFunction {
    
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

System.out.println(isPrime(n));
    }

    public static boolean isPrime(int n){

        boolean isPrime=true;

        //corner cases
        if(n==2){
            isPrime=true;
        }
        else{

 for(int i=2 ;i<=n-1;i++){
            if(n%i ==0){
                isPrime=false;
                break;
            }
        }


        }
       
        return isPrime;

    }



}



//     // the no divide only iwth 1 and n are called prime no.
// for(int i=2 to i=n-1)
// (n%i==0)
