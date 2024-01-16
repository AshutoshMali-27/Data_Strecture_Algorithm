public class BubbleSort {

    public static void main(String args[]){

        int arr[]={5,4,1,3,2};
        bubblesort(arr);
        printarr(arr);
    }


    public static void bubblesort(int arr[]){


        for(int turn=0;turn<arr.length-1;turn++){

            int swap=0;
            for(int j=0;j<arr.length-1-turn;j++){

                if(arr[j] >arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
                swap++;
               
            }
            System.out.println(swap);
            

            

        }
       

    }

    public static void printarr(int arr[]){

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }




     
}




//Arrangaing by asc and dsc order 
// large or smaller come to the end of array by swapping with adjacent element called bubble sort
// n={54132}
//n=5

// for oth turn
// 4,1,3,2,5
// n form (0 to n-2)

// for 1st turn
// 1,3,2,4,5
// n from (0 to n-3)


// for 2nd turn
// 1,2,3,4,5

// n from (0 to n-4)

// for 4th turn
// 1,2,3,4,5
// n from (0 to n-5)


//for(turn=0 to n-1)
 //for(int j=0 to n-2-turn)

 // time complexity is o(n2)
