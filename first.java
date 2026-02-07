public class First{
    public static void main (String []arg){
        int arr[] = new int [10] ;
        int n =0;
        int count =0; 
        while (n>0){
            arr[n%10]++ ;
            n/=10;
        }
        for (int i =0 ; i <10 ; i++){
            if(arr[i] != 0){
                count++ ;
            }
        }        System.out.println(count);

      
    }
}     
