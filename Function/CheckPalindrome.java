import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String args[]){

        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int palindrome=sc.nextInt();


        if(isPalindrome(palindrome)){
            System.out.println("number :" +palindrome +" is a palindrome");

        }
        else{

            System.out.println("Number :" +palindrome+ " is not a palindrome");
        }


    } 


    public static boolean isPalindrome(int n){


        int palindrome=n;
        int reverse=0;

        while (palindrome != 0) {

            int rem=palindrome%10;
            reverse=reverse*10+rem;
            palindrome=palindrome/10;
        }

        if(n==reverse){
            return true;
        }

        return false;


    }
}
