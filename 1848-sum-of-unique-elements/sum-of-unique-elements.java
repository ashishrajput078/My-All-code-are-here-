class Solution {
    public int sumOfUnique(int[] nums) {
        int[] f = new int[101];
        for (int n : nums) f[n]++;
        int sum = 0;
        for (int i = 1; i <= 100; i++)
            if (f[i] == 1) sum += i;
        return sum;
    }
}