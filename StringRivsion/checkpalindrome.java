public class checkpalindrome {
    
    public static void main(String args[]){

        String str="rececar";

    }

    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){

            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-i-1)){

                return false;
        }
    }
}
