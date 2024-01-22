public class StringBuilders {

     public static void main(String args[]){

        StringBuilder sb=new StringBuilder("");
        for(char ch='a' ;ch<='z';ch++){
            sb.append(ch);
        }

        System.out.println(sb);
        System.out.println(sb.length());
     }
}


/*
 * StringBulder sb=new StringBuilder("hw")
 * if int a=10;a.ToString() is not possible
 * 
 * Integer a=10; a.ToString() is possible 
 * the differcece is we want a as object to convert a  to  string
 * Time complexity id 0(26)
 * 
 */
