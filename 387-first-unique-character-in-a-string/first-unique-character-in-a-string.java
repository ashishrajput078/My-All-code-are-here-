class Solution {
    public int firstUniqChar(String s) {
       int freq [] = new int [256];
       for ( char c : s.toCharArray()){
        freq[c]++ ;
       }
       int idx = -1 ;
       for ( int i =0 ; i<s.length() ;i++){
        if ( freq[s.charAt(i)] == 1){
            idx = i ; break ;
        }
       }
       return idx ;
        }
    }
