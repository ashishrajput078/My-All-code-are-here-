class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int m = 0 ;
        for ( int i =1 ; i<arr.length; i++){
            if ( arr[i]>arr[m]){
                m = i ;
            }
        }
        return m ;
    }
}