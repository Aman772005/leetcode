class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int price : prices){
            if(price < buy ){
                buy = price;
            }else{
                maxprofit = Math.max(maxprofit,price-buy);
            }
        }
        return maxprofit ;
    }
}