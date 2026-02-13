class Solution {
    public int sumBase(int n, int k) {
        int digit = 0 ;
        while (n!=0){
            digit += n% k ;  
            n = n/k;
        }
        return digit ;
    }
}