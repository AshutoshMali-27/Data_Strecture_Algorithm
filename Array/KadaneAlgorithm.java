public class KadaneAlgorithm {
    
    public static void main(String args[]){

        int number[]={1,2,3,7,5,6};
        KadaneAlgorithm(number);
    }

     public static void   KadaneAlgorithm( int number[]){


        int maxsum=Integer.MIN_VALUE;
        int currsum=0;

        for(int i=0;i<number.length;i++){
        currsum=currsum+number[i];

         if(currsum <0){
            currsum=0;
        }
        maxsum=Math.max(currsum,maxsum);
        }

        System.out.println("maximum sum is :" +maxsum);
       


     }
     
}
