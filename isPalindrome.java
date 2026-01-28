class Solution {
    public boolean isPalindrome(int x) {
        String A = String.valueOf(x);
        int n = A.length();

        for (int i = 0; i < n / 2; i++) {
            if (A.charAt(i) != A.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}