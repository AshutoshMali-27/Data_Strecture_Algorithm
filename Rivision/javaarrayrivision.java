//1.Print the program to accept array
//2.Calculate % using array
//.Update marks using Function
//4.linear search in array
//5.Find Largest Number in array
//6.find greteest
//7.find smallest
//8.binarysearch
//9.Reverse of Array
//10.pairs of array
//11.max sum of array(brute force)
//12.max sum of array(prefix method)
//13.max sum of array(kadane algorithm)
//14.min sum of array(brute force method)
//15.min sum of array(prefix sum method)
//16.min sum of array(kadane algorithm)
//17.Trapping Rainwater
//18.best time to buy and sell stock
import java.util.Scanner;

public class javaarrayrivision {
    
    public static void main(String args[]){

        // int marks[]=new int [100];
        // Scanner sc=new Scanner(System.in);
        // marks[0]=sc.nextInt();
        // marks[1]=sc.nextInt();
        // marks[2]=sc.nextInt();

        // System.out.println("Phy :" +marks[0]);
        // System.out.println("chem :" +marks[1]);
        // System.out.println("math :" +marks[2]);
        // marks[2]=100;
        // System.out.println(marks[2]);
        // int number[]={1,2,3};
        // int percentage=(number[0]+number[1]+number[2])/3;
        // System.out.println("percentage="+percentage+"");

        // int marks[]={96,98,99};
        // Update(marks);

        // for(int i=0;i<marks.length;i++){
        //     System.out.print(marks[i]+" ");

        // }
        // System.out.println();
    //     int number[]={2,4,6,8,10,12,14,16};
    //     int key=10;
    //  int index=linearsearch(number,key);
    //  if(index ==-1){
    //     System.out.print("Not Found");
    //  }
    //  else{
    //     System.out.print("key is at "+index);
    //  }

   // int number[]={1,2,6,3,5};
  //  System.out.print(getLargest(number));
    //getsmallest
   // System.out.print(getsmallest(number));

//    int number[]={2,4,6,8,10,12,14};
//    int key=10;
//    System.out.print("Index for key is:"+ binarysearch(number,key));
// int number[]={2,4,6,8,10,12,14};
// reverseofarray(number);
// for(int i=0;i<number.length;i++){
//     System.out.print(number[i]);
// }

//int number[]={2,4,6,8,10,12,14};
//printpairs(number);
//int number[]={2,4,6,8,10,12,14};
//subarray(number);
//int number[]={2,4,6,8,10,12,14};
// maxsubarraysum(number);
//kadanes(number);

//int number[]={-1,4,8,9,-3,7,5};
//minsubarraysumBruteforcemethod(number);
//minsubarraysumusingPrefixmethod(number);
//kadanealgorithm(number);

//int height[]={4,2,0,6,3,2,5};
//System.out.println(trappedrainwater(height));
int prices[]={7,1,5,3,6,4};
System.out.println(buyandsellstock(prices));

    }
    public static int buyandsellstock(int prices[]){

        int buypprice=Integer.MAX_VALUE;
    
        int maxprofit=0;
        
        for(int i=0;i<prices.length;i++){
            if(buypprice<prices[i]){
                int profit=prices[i]-buypprice;//today profit
                maxprofit=Math.max(maxprofit, profit); //max profit
            }else{
                buypprice=prices[i];
            }
        }


        return maxprofit;
    }

    public static int trappedrainwater(int height[]){

        int n=height.length;
        int leftmax[]=new int[n];
        leftmax[0]=height[0];

        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(height[i], leftmax[i-1]);
        }
        int rightmax[]=new int [n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i], rightmax[i+1]);
        }
        int trappedwater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftmax[i], rightmax[i]);
            trappedwater=trappedwater+(waterlevel-height[i]);
        }

        return trappedwater;



    }

    public static void kadanealgorithm(int number[]){

        int currsum=0;
        int minsum=Integer.MAX_VALUE;

        for(int i=0;i<number.length;i++){
           currsum=currsum+number[i];
           if(currsum <0){
            currsum=0;
        }
        minsum=Math.min(currsum, minsum);
        }
       
       

        System.out.println(minsum);

    }

    public static void minsubarraysumusingPrefixmethod(int number[]){
int currsum=0;
int minsum=Integer.MAX_VALUE;

int prefix[]=new int[number.length];

prefix[0]=number[0];

for(int i=1;i<prefix.length;i++){

    prefix[i]=prefix[i-1]+number[i];
}

for(int i=0;i<prefix.length;i++){
    int start=i;
    for(int j=i;j<prefix.length;j++){
        int end=j;

        for(int k=start;k<end;k++){

            currsum=start==0?prefix[end]:prefix[end]-prefix[start-1];
        }
        System.out.print(currsum +" ");

        if(currsum<minsum){

            minsum=currsum;
        }
    }

}
System.out.println(minsum);

    }

    public static void minsubarraysumBruteforcemethod(int number[]){

        int currsum=0;
        int minsum=Integer.MAX_VALUE;

        for(int i=0;i<number.length;i++){

            int start=i;
            for(int j=i;j<number.length;j++){

                int end=j;

                for(int k=start;k<end;k++){

                    currsum=currsum+number[k];

                }
                System.out.print(currsum +" ");

                if(currsum<minsum){

                    minsum=currsum;
                }
            }
        }
        System.out.println(minsum);

    }


public static void kadanes(int number[]){
int maxsum=Integer.MIN_VALUE;
int currsum=0;

for(int i=0;i<number.length;i++){
    currsum=currsum+number[i];

    if(currsum<0){
        currsum=0;
    }
    maxsum=Math.max(currsum,maxsum);
}
System.out.println("Our max Subarray sum is :"+maxsum);
}

    public static void maxsubarraysum(int number[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[number.length];

        prefix[0]=number[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+number[i];
        }

        for(int i=1;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){

                int end=j;

                currsum=start==0?prefix[end]: prefix[end]-prefix[start-1];
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }

           
        }
        System.out.println("Max sum="+maxsum);
    }

    public static void printsubarraysum(int number[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                 currsum=0;
                int end=j;
                for(int k=start;k<end;k++){

                    currsum=currsum+number[k];
                }
                System.out.print(currsum+" ");
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("max sum ="+maxsum);
    }
    

    public static void subarray(int number[]){

        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){

                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(number[k]+" ");;
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void printpairs(int number[]){
int tp=0;
        for(int i=0;i<number.length;i++){
            int firstnumber=number[i];
            for(int j=i+1;j<number.length;j++){

                int lastnumber=number[j];
                System.out.print("("+firstnumber+","+lastnumber+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs"+tp);
    }

    public static void Update(int marks[]){

        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }

    public static int linearsearch(int number[], int key){

        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }



public static int getLargest(int number[]){

    int largest=Integer.MIN_VALUE;

    for(int i=0;i<number.length;i++){
        if(largest<number[i]){
            largest=number[i];

        }
    }
    return largest;
    
}

public static int getsmallest(int number[]){
    int smallest=Integer.MAX_VALUE;
    for(int i=0;i<number.length;i++){
        if(smallest>number[i]){
            smallest=number[i];
        }
    }
    return smallest;
}

public static int binarysearch(int number[],int key){
int start=0;
int end=number.length-1;
while(start<=end){
    int mid=(start+end)/2;
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

public static void reverseofarray(int number[]){
int first=0;
int last=number.length-1;
while (first <last) {
    int temp=number[last];
    number[last]=number[first];
    number[first]=temp;

    first++;
    last--;
}
}


}
