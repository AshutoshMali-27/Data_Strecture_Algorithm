// Check no. is prime or not

import java.util.Scanner;

public class Primeornot {
    
public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();

    boolean isPrime=true;

    // for(int i=2;i<=n-1;i++){

    //     if(n%i ==0){ 
    //     // n is multiple of i ( i not equal to 1 or n)
    //         isPrime=false;
    //     }
    // }

    for(int i=2; i<=Math.sqrt(n);i++){
if(n%i==0){
    isPrime=false;
}
    }

    if(isPrime ==true){
        System.out.println("n is prime");
    }
    else
    {
        System.out.println("n is not prime");
    }
}
    
}
