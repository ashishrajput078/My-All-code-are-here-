class Solution {
    public int mostWordsFound(String[] se) {
        int maxword = 0 ; 
        for ( int i = 0 ; i< se.length ; i++){
          String s = se[i] ;
            int spacecount = 0 ;
            for ( int j = 0 ; j<s.length()  ;j++){
                  if ( s.charAt(j) == ' '){
                    spacecount++ ;
                  }
            }
            int word = spacecount +1 ;
            if ( word  > maxword){
                maxword = word ;
            }
        }
        return  maxword ;
    }
}