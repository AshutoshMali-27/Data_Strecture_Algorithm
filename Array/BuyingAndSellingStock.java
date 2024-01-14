public class BuyingAndSellingStock {
    
    public static void main(String args[]){

        int prices[]={7,1,5,3,6,4};
       System.out.println(BuyandSellStock(prices)); 
    }


    public static int BuyandSellStock(int prices[]){


    
        int buyPrices=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(buyPrices <prices[i]){
                //profit

                int profit = prices[i] -buyPrices;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buyPrices=prices[i];
            }
        }
        return maxProfit;

    }
}
