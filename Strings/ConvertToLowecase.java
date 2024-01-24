public class ConvertToLowecase {
    public static void main(String args[]){

        String str="HELLO MY NAME IS ASHUTOSH";

        
        System.out.println(ToLower(str));
    }

    public static String ToLower(String str){

        StringBuilder sb= new StringBuilder("");
        char ch=Character.toLowerCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){

            if(str.charAt(i) ==' '  && i<str.length()-1){

                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toLowerCase(str.charAt(i)));

            }
            else{

                sb.append(str.charAt(i));
            }
        }


        return sb.toString();

    }
}
