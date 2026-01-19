// public class first{
//     public static void main (String []arg){
//         String str = "Hello Java";
//         int len = str.length();
//         for (int i =0 ; i<len ;i++){
//             char ch = str.charAt(i);
//             if ( ch>= 'A' && ch <= 'Z'){
//                 System.out.println((char)(ch + 32));
//             }
//             else if ( ch >= 'a' && ch<= 'z'){
//                 System.out.println((char)(ch-32));
//             }
//             else 
//                 System.out.println(ch);
//         // String str1 = 12 + 7+ " * " + 5 + 3+7 ;
//         // System.out.println(str1);
//         }
//     }
// }
           String str = "\r\r\t  abc  def\r\r\n  ";
            str =  str.trim();
            system.out.println(str);

        str = str.replace ('a','b');
        System.out.println(name.length());
        System.out.println(name.charAt(1));
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.startsWith("aNUSHAr")); 
        System.out.println(name.contains("Adarsh"));
    // collection of characters is STRIING 
     
    
public class first{
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


