class Solution {
    public int pivotIndex(int[] nums) {
       int totalsum =0 ;
        for ( int i=0 ;i<nums.length ;i++){
          totalsum += nums[i] ;
        }
        int leftsum =0;
        for ( int j =0 ;j<nums.length ;j++){
            int rightsum = totalsum - nums[j] - leftsum ;
            if ( rightsum == leftsum)  return j ;
             leftsum += nums[j] ;
            
        }
        return -1 ;
    }
}