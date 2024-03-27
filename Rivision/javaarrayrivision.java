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
int number[]={2,4,6,8,10,12,14};
// maxsubarraysum(number);
kadanes(number);
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
