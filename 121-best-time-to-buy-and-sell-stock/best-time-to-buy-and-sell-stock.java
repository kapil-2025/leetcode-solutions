class Solution {
    public int maxProfit(int[] prices) {
     int n=prices.length;
     int maxPrice=0;
     int minPrice=Integer.MAX_VALUE;
     for(int i=0; i<n; i++){
        if(prices[i]<minPrice){
            minPrice=prices[i];
        }else{
       int profit=prices[i]-minPrice;

     if(profit>maxPrice){
        maxPrice=profit;
     }}}return maxPrice;
    }
}