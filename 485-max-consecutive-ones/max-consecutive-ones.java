class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int mcount =0 ;
        int ccount =0 ;
        for (int num : nums){
            if (num == 1){
             ccount++ ; 
             mcount = Math.max(mcount, ccount);
            }
            else {
                ccount = 0;
            }
        }
        return mcount ;
}    
}