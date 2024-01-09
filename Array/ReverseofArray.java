public class ReverseofArray {
    
    public static void main(String agrs[]){

        int number[]={2,4,6,8,10};
reversearray(number);

for(int i=0;i<number.length;i++){
    System.out.print(number[i]+ " ");

}
System.out.println();
    }
    public static void reversearray(int number[]){
        int first=0;
        int last= number.length-1;
        while (first <last) {
            int temp =number[last];
            number[last]=number[first];
            number[first]=temp;

            first++;
            last--;
            
        }

    }


}
