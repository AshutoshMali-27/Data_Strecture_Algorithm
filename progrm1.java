//Keep entering number till user enters a multiple of 10

import java.util.Scanner;

public class progrm1 {
    
    public static void main(String[] args){

      Scanner sc=new Scanner(System.in);
     // int n=sc.nextInt();

     do{
        System.out.print("Enter your Number : ");
        int n=sc.nextInt();
        if(n%10==0){
            break;
        }
        System.out.println(n);
     }while(true);


    }
}
