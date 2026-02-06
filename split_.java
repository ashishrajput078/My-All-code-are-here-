class split_ {
    public int countOdds(int low, int high) {
        int count =0 ;
        int sum = (high - low +1)/2 ;
        if ( low %2 != 0 && high % 2 != 0){
            return sum +1;
        }
        else 
        return sum ;
        
    }
}