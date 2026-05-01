import java.math.BigInteger;
class Solution {
    public  List<Integer> addToArrayForm(int[] num, int k) {
        String s = "";
        for (int x : num) s += x;
        BigInteger a = new BigInteger(s);
        BigInteger b = BigInteger.valueOf(k);
        String res = a.add(b).toString();
         List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < res.length(); i++) {
             ans.add(res.charAt(i) - '0');
        }
        return ans;
    }
}