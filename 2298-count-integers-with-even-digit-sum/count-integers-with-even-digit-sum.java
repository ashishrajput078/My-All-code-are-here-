class Solution {
    public int countEven(int num) {
         
         int count =0 ;
       for ( int i =1 ; i<=num ; i++){
         int sum =0 ;
         int tem =0 ;
         tem = i;
       
       while ( tem>0){
        sum += tem % 10 ;
        tem = tem/ 10 ; 
       }
       
       if ( sum % 2 ==0 ){
         count++ ;
       }}
       return count ;
    }
}