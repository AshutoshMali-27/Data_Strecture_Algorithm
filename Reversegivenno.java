import java.util.Scanner;

public class Reversegivenno {
    
    public static void main(String[] args){

        //rev=(rev*10)+lastdigit;

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int rev=0;
        
        while(n>0){
            int LD=n%10;
            rev=(rev*10)+LD;
            n=n/10;
        }
        System.out.println(rev);

    }
}
