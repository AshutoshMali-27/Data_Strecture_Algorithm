package StringRivsion;

public class stringcharat {
    
    public static void main(String args[]){

        String firstName="Ashutosh";
        String lastName="Mali";
        String FullName=firstName+" "+lastName;
        //System.out.println(FullName.charAt(3));

        printLetters(FullName);
    }

    public static void printLetters(String str){

        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
    }
}
