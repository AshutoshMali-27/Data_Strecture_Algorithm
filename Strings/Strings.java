import java.util.Scanner;

public class Strings{
    public static void main(String args[]){
        char arr[]={'a','b','c','d'};
        String str=new String("xyz");
        String str2="abcd";

        //System.out.println(str2);

        //System.out.println(str);

        //String are Immutable

       // Scanner sc=new Scanner(System.in);
        String name;
      //  name=sc.next();
        //name=sc.nextLine();
      //  System.out.println(name);

     // String fullName="Ashutosh Mali";
      //System.out.println(fullName.length());


      String firstName="Ashutosh";
      String lastName="Mali";
      String fullName=firstName +" "+lastName;
      //System.out.println(fullName);

     // System.out.println(firstName.charAt(3));
      PrintString(fullName);

    }

    public static void PrintString(String str){

        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
}