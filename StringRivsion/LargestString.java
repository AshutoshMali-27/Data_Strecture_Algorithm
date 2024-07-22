public class LargestString {
    
public static void main(String args[]){

    String fruit[]={"apple","mango","banana"};

    String largest=fruit[0];
    for(int i=1;i<fruit.length;i++){

        if(largest.compareTo(fruit[i])<0){
            largest=fruit[i];
        }
    }

    System.out.println(largest);
}


}



// str1.compareTo(str2)
// 0:equal
// <0:-ve str1<str2
// >0:+ve str1>str2