public class Assignment1 {
    
    public static void main(String args[]){

        //int number[]={1,2,3,1};
       // int prices[]={8,2,4,5,6,3,2};
        //System.out.println(Distintornot(number));
        //System.out.println(stockupdate(prices));
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappedwater(height));
    }

    public static boolean Distintornot(int number[]){

    

        for(int i=0;i<number.length-1;i++){

            for(int j=i+1;j<number.length;j++){

                if(number[i] ==number[j]){
                    return true;

                }

            }
        }
        return false;
    

    }



    public static int stockupdate(int prices[]){

        int CP=Integer.MAX_VALUE;
        int maxprice=0;

        for(int i=0;i<prices.length;i++){

            if(CP<prices[i]){
                
                int profit=prices[i]-CP;

                maxprice=Math.max(maxprice, profit);
            }
            else{
                CP=prices[i];
            }

        }
        return maxprice;

    }


    public static int trappedwater(int height[]){

        int n=height.length;
        int leftmax[]=new int[n];
        leftmax[0]=height[0];

        for(int i=1;i<n;i++){
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
        trappedwater=trappedwater+(waterlevel -height[i]);
    }
    return  trappedwater;

    }

}
