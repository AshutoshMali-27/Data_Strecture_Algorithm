public class ConverttoUpper {
    
    public static String toUpperCase(String str){

        StringBuilder sb=new StringBuilder("") ;
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
    }
    public static void main(String args[]){
        String str="hi, i am shradha";
    }
}
