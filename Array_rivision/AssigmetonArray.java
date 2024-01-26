public class AssigmetonArray {
    
    public static void main(String args[]){


       // int number []={2,4,6,8,10,12,14,16};
        //int key=10;

        // int index=LinearSearch(number,key);
        // if(index==-1){
        //     System.out.println("No result found");
        // }
        // else{
        //     System.out.println("Element present of position"+index);
        // }


       // int number[]={1,2,6,3,5};
        //System.out.println("largest value us :" +Largets(number));

        // int number[]={2,4,6,8,10,12,14};
        // int key=10;
        // System.out.println("index for key is :" +BinarySearch(number,key));

        // int number[]={2,4,6,8,10};

        // reverse(number);
        // for(int i=0;i<number.length;i++){
        //     System.out.print(number[i] +" ");
        // }
        // System.out.println();

      //  int number[]={2,4,6,8,10};

       // PrintPairs(number);
     //  printSubArray(number);
     //maxSubarraySum(number);
    //  int number[]={1,-2,6,-1,3};
    //  maxSubarraySumPrefix(number);

   // int number[]={-2,-3,4,-1,-2,1,5,-3};

    // maxsubarraysumkadanealgorithm(number);

    int height[]={4,2,0,6,3,2,5};

    System.out.println(Trappingrainwater(height));
    
    }

    public static int LinearSearch(int number[],int key){

        for(int i=0;i<number.length;i++){

            if(number[i]==key){

                return i;
            }
        }


        return -1;
    }


    public static int Largets(int number[]){

        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(number[i]>largest){
                largest=number[i];
            }

            if(number[i]<smallest){
                smallest=number[i];
            }
        }
        System.out.println("Smallest value is "+smallest);

        return largest;
    }


public static  int BinarySearch(int number[],int key){

    int start=0;
    int end=number.length-1;

    while(start<=end){

        int mid=(start + end)/2;
        if(number[mid]==key){
            return mid;
        }
        if(number[mid]<key){
            start=mid+1;
        }
        else{
            end=mid-1;
        }

    }
    return -1;
}


public static void reverse(int number[]){

    int first=0,last=number.length-1;

    while(first<last){
        int temp=number[last];;
        number[last]=number[first];
        number[first]=temp;
        first++;
        last--;
    }
}

public static void PrintPairs(int number[]){

    for(int i=0;i<number.length;i++){
    
        for(int j=i+1;j<number.length;j++){

            System.out.print("("+number[i] +"," +number[j]+")");
        }
        System.out.println();
    }
}


public static void printSubArray(int number[]){
int ts=0;
    for(int i=0;i<number.length;i++){
        for(int j=i;j<number.length;j++){
            for(int k=i;k<=j;k++){
                System.out.print(number[k]+" ");
            }
            ts++;
            System.out.println();
            
        }
        System.out.println();
       
    }

    System.out.println("total subarray ="+ts);
}



public static void maxSubarraySum(int number[]){
    int currsum=0;
    int maxsum=Integer.MIN_VALUE;

    for(int i=0;i<number.length;i++){
        for(int j=i;j<number.length;j++){
            currsum=0;
            for(int k=i;k<=j;k++){
              currsum+=number[k];
            }
            System.out.println(currsum);
          if(maxsum < currsum)
            {
                maxsum=currsum;
            }
        }       
    }

    System.out.println("max sum = "+maxsum); 
}


public static void maxSubarraySumPrefix(int number[]){

 int currsum=0;
 int maxsum=Integer.MIN_VALUE;
 int prefix[]= new int [number.length];

 prefix[0]=number[0];
 for(int i=1;i<number.length;i++){
    prefix[i]=prefix[i-1]+number[i];
 }

 for(int i=0;i<prefix.length;i++){
    for(int j=i;j<prefix.length;j++){

currsum = i==0 ?prefix[j]: prefix[j]-prefix[i-1];

if(maxsum<currsum){
    maxsum=currsum;
}

    }
 }
 System.out.println("max sum= " +maxsum);

}


public static void maxsubarraysumkadanealgorithm(int number[]){

    int maxsum=Integer.MIN_VALUE;
    int currsum=0;

    for(int i=0;i<number.length;i++){
        currsum=currsum+number[i];
        if(currsum<0){
            currsum=0;
        }
        maxsum=Math.max(maxsum, currsum);
    }

    System.out.println(maxsum);
}


public static int Trappingrainwater(int height[]){
    int n=height.length;
    int leftmax[]=new int [n];
    leftmax[0]=height[0];
    for(int i=1;i<n;i++){
        leftmax[i]=Math.max(leftmax[i-1], height[i]);
    }
    int rightmax[]=new int [n];
    rightmax[n-1]=height[n-1];
    for(int i=n-2;i>=0;i--){
        rightmax[i]=Math.max(height[i],rightmax[i+1]);
    }

    int trappedwater=0;
    for(int i=0;i<n;i++){

        int waterlevel=Math.min(rightmax[i], leftmax[i]);
        trappedwater=trappedwater +(waterlevel -height[i]);
    }

  
  
    return trappedwater;

    
}

}
