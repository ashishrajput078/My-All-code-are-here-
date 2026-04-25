class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder() ;
       int w1 = word1.length() ; 
       int w2 = word2.length() ;
        int max = Math.max(w1 , w2);
        for ( int i = 0 ; i<max; i++){
            if (i<w1)  sb.append(word1.charAt(i));
            if (i<w2) sb.append(word2.charAt(i));
            
        } return sb.toString() ; 
    }

}