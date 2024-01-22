public class CompareString {
    
    public static void main(String args[]){
        String str1 = "Hello";
        String str2 = "Hello";
        String str3= new String("Hello");
        
        if(str1==str2){
System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }

        if(str1==str3){
            System.out.println("String are equal");
                    }
                    else{
                        System.out.println("String are not equal");
                    }

                    if(str1.equals(str3)){
                        System.out.println("Strings are equal");
                    }
                    else{
                        System.out.println("Strings are not equals");
                    }

    }
}
