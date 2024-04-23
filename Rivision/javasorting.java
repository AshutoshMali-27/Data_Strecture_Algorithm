//1.Bubble Sort
//2.Selection Sort
//1.Insertion Sort
//1.Counting Sort
public class javasorting {
    
    public static void main(String args[]){


        int arr[]={5,4,1,3,2};
       bubble_sort(arr);
       // selectiom_sort(arr);
        printArr(arr);

    }


    public  static void bubble_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){

            for(int j=0;j<arr.length-i-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }

        }
    }




    public static void selectiom_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]<arr[j]){
                    minpos=j;
                }
            }

            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
 
 

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }


    




 


}
