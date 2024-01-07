import java.util.Scanner;

public class PrintReverseofno {
    
    public static void main(String[] args){

    //  int   n=15699;
      // last digit num%10;
      // remove last digit num/10;

      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
while(n>0){
    int ld=n%10;
    System.out.print(ld +"");
    n=n/10;

}
System.out.println();

    }
}
