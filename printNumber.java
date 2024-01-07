import java.util.Scanner;

public class printNumber{
    public static void main(String[] arg){

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   int counter=0;


    while (counter <=n) {
        
        System.out.println(counter);
        counter++;
    }
    }
}