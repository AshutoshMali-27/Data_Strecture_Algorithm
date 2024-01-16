public class SelectionSort {
    
    public static void main(String args[]){

        int arr[]={5,4,1,3,2};
        selectionsort(arr);
        printarr(arr);
    }

    
    public static void selectionsort(int  arr[]){

        for(int i=0;i<arr.length-1;i++){

         int   minpos=i;

         for(int j=i+1;j<arr.length;j++){

            if(arr[minpos]>arr[j]){

                minpos=j;
            }
         }

         //swap
         int temp= arr[minpos];
         arr[minpos]=arr[i];
         arr[i]=temp;
        }
    }


    public static void printarr(int arr[]){

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }

}


//pick the smallest (from unsorted) put it at the beginning


//         5,4,3,2,1
//  1       5,4,3,2
//  1,2     5,4,3
//  1,2,3   5,4
//  1,2,3,4,5


 //for(int i=0 to n-2)
 //for(int j=i+1 to n-1) 

 //