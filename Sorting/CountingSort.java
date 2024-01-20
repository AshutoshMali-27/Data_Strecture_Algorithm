public class CountingSort {
    
    public static void main(String args[]){

        int arr[]={1,4,1,3,2,4,3,7};
        CountingSort(arr);
        printarr(arr);

         
    }


    public static void CountingSort(int arr[]){

     int largest =Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++){
        largest=Math.max(largest, arr[i]);
     }
     int count[]=new int[largest+1];
     for(int i=0;i<arr.length;i++){
        count[arr[i]]++;
     }
     int j=0;
     for(int i=0;i<count.length;i++){
        while(count[i]>0){
            arr[j]=i;
            j++;
            count[i]--;
        }
     }

}


public static void printarr(int arr[]){

    for(int i=0;i<arr.length;i++){

        System.out.print(arr[i]+" ");
    }

    System.out.println();
}

}
/*
 * 
 * Counting Sort
 * 1,4,1,3,2,4,3,7
 * in counting sort we calculate frequency of element in array
 * 
 * suppose wwe have frequency of given array at every index position
 * 
 * [0,2,1,2,2,0,0,1] count of 0 to 7 element
 *then we create new array and store the elemet in that order

 [1,1,2,3,3,4,4,7]
 *  */

 //for(int i=0 to n)
 //for(int i=0 to max(range))
 //0(n+range)