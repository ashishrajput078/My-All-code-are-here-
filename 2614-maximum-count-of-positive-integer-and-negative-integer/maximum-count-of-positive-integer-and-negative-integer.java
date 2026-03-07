class Solution {
    public int maximumCount(int[] nums) {
        int negcount =0 ;
        int posicount =0 ; 
        for ( int i =0 ;i<nums.length ;i++){
           if ( nums[i] < 0)  negcount++ ;
           if ( nums[i] > 0)  posicount++ ;
        }
        if (negcount > posicount ) return negcount ;
         if (negcount < posicount ) return posicount ;  
         return negcount ; 
    }
}