import java.math.BigInteger ;
class Solution {
    public int getSum(int a, int b) {
        BigInteger s = new BigInteger(String.valueOf(a));
        BigInteger x = new BigInteger(String.valueOf(b));
        BigInteger r = s.add(x) ;
        return r.intValue() ;
    }
}