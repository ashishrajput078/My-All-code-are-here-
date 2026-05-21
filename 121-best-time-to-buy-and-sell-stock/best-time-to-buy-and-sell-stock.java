class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE ; 
        int maxa = 0 ; 
        for ( int price : prices){
            if ( price < min) min = price ;
            else { maxa = Math.max(maxa , price - min) ;
            }
        }
       return maxa ;

    }
}