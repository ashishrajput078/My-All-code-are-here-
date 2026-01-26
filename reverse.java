public class reverse{
    public static void reverse(int [] array , int start ,  int end ){
    while (start < end ){
        int temp  = array[start] ;
        array[start] = array[end];
        array[end]= temp ;
        start++ ;
        end--;
    }
    }
}
public static void main(String[]args){
    int []arr = {1,2,3,4,5};
    int len = arr.length-1;
    int n = 6;
    n= n%len ;
    reverse(arr , len -n , len-1);
    reverse(arr , 0 , len-1-n);
    reverse(arr , 0 , len-1);
    System.out.println(Arrays.toString(arr));
}
