public class CheckPalindrome {
    
    public static void main(String args[]){
        String str="racecar";
       // Ispalindrome(str);
       System.out.println(Ispalindrome(str));


    }

    public static boolean  Ispalindrome(String str){

        for(int i=0 ;i<str.length()/2;i++){
        int n=str.length();

        if(str.charAt(i) !=str.charAt(n-1-i)){
            // not a palindrome
            return false;
        }
        }
        return true;

    }
}
