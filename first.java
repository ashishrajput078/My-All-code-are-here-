public class First{
    public static void main (String []arg){
        String str = "Hello Java";
        int len = str.length();
        String result = "" ;
        for (int i =0 ; i<len ;i++){
            char ch = str.charAt(i);
            if ( ch>= 'A' && ch <= 'Z'){
               result = result + ((char) (ch +32));
            }
            else if ( ch >= 'a' && ch<= 'z'){
                result = result + ((char)(ch-32));
            }
            else 
                result = result + ch ;
        }
        System.out.println(result);
    }
}     
