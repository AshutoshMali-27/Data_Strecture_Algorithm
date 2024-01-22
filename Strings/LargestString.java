public class LargestString {
    public static void main(String args[]){
      
        String fruits[]={"apple","mango","banana"};
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
}




/*
 * for given set of strings print largest string
 * "apple" ,"mango","banana"
 * 
 * Lexicographic order -compare two string the first no of the two sting of smaller then the string are smallest.
 * in apple and banana 
 * a come after b hence apple is smallest
 * 
 * 
 * we use compareTo function 
 * str1.compareTo(str2)
 * if 0 then equal
 * -ve output str1 <str2
 * +output str1>str2
 * 
 * in compare to operator A and a are diffcult .
 * 
 * but in Comparetoignorecase capital A and a are same
 * 
 * comparetoIgnorecase
 */