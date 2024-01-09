import java.util.*;
public class LargestInArray {
    
    public static void main(String agrs[]){
        int number[]={1,2,3,7,5,6};

        System.out.println("largest value is :" + getlargest(number));

    }

    public static int getlargest(int number[]){

        int largest=Integer.MIN_VALUE; //-infinity
        int smallest=Integer.MAX_VALUE;// +infinity
        for(int i=0;i<number.length;i++){
            if(largest < number[i]){
                largest = number[i];
            }

             if(smallest > number[i]){
                smallest = number[i];
            }
        }
        System.out.println("smallest value is :" +smallest);
        return largest;
    }
}
