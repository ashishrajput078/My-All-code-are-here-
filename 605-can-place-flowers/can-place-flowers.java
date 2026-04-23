class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        for ( int i =0 ;i<fb.length ; i++){
            if ( fb[i] == 0){
                int left = (i== 0)? 0 : fb[i-1] ;
                int right = (i== fb.length-1) ? 0 : fb[i+1] ;
            
            if ( left ==0 && right == 0 ){
               fb[i] =1 ;
               n-- ;
            }}
            if(n<= 0)   return true ;
        }
        return n<= 0 ;
    }
}