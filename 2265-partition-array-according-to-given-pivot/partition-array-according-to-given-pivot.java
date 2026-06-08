class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       int n=nums.length ;
       int lessCount = 0 ;
       int equalCount = 0 ;
      
        for ( int num : nums){
            if ( num < pivot) lessCount++ ;
            else if ( num == pivot) equalCount++ ;
        }
         int  lessIdx = 0;
       int equalIdx = lessCount;
       int   greaterIdx = lessCount + equalCount;
       int[] arr = new int[nums.length] ; 
       for ( int num : nums){
        if ( num <pivot) arr[lessIdx++] = num ;
        else if ( num == pivot ) arr[equalIdx++] = num ;
        else arr[greaterIdx++] = num ;
       }
       return arr ;
        }
}