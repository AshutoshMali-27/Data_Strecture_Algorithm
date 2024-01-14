public class PrefixArray {
    
    public static void main(String args[]){

        int number[]={1,-2,6,-1,3};
        prefixsum(number);
    }

    public static void prefixsum(int number[]){

    
        int currSum=0;
        int maxsum=Integer.MIN_VALUE;
 
        int prefix[]=new int[number.length];

        prefix[0]=number[0];

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1] +number[i];
        }

        for(int i=0;i<number.length;i++){
            int start=i;
             currSum=0;
            for(int j=i;j<number.length;j++){
                int end=j;
               
                currSum= start == 0 ?prefix[end]: prefix[end]-prefix[start-1];

                if(maxsum<currSum){
                    maxsum=currSum;
                }
            }
        }
         
        System.out.println("max sum ="+maxsum);

    }



}


//Prefix[end] =prefix[start-1]
//prefix[i-1] +number[i]