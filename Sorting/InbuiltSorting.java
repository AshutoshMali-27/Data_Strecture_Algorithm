import java.util.Arrays;

public class InbuiltSorting {
    
    public static void main(String args[]){

        int arr[]={5,4,1,3,2};
        Arrays.sort(arr);
       // System.out.println(arr);

       printarr(arr);

    }


    public static void printarr(int arr[]){

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }
}


/*
 * array.sort(arr)
 * 0(nlogn)
 */
