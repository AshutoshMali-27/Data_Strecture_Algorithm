public class findMaxsumofArray {
    
    public static void main(String args[]){

        int number[]={-2,-3,4,-1,-2,1,5,-3};
        Bruteforcemethod(number);
        Prefixmethod(number);
        kandanealgo(number);

    }


    public static void Bruteforcemethod(int number[]){



        int currSum =0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<number.length;i++){

            int start=i;
            for(int j=i;j<number.length;j++){

                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){

                    currSum=currSum+number[k];

            
                    if(maxsum<currSum){
                        maxsum=currSum;
                    }




                }

             
            }
        }
           System.out.println("max sum using Brute forcemethod  is"+maxsum);

    }


    public static void Prefixmethod(int number[]){


        int currSum=0;
        int maxsum1=Integer.MIN_VALUE;
        int prefix []=new int [number.length];
        prefix[0]=number[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1] +number[i];
        }

        for(int i=0;i<number.length;i++){
            int start=i;

            //currSum=0;
            for(int j=i;j<number.length;j++){

                int end=j;

             currSum =start==0 ? prefix[end]:prefix[end] -prefix[start -1];


             if(maxsum1 <currSum){

                maxsum1=currSum;
             }

            }
        }
        System.out.println("max sum using Prefix method :"+maxsum1 );
    }


    public static void kandanealgo(int number[]){


        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<number.length;i++){

  cs=cs+number[i];
        if(cs<0){
            cs=0;

        }

           ms=Math.max(ms, cs);
        }

        System.out.println(" max sum using Kandane algo is" +ms);
      

     

    }
}
