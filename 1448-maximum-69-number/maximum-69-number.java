class Solution {
    public int maximum69Number(int num) {
        int temp = num;
        int place = 1;
        int pos = 0;

        while (temp > 0) {
            if (temp % 10 == 6) {
                pos = place;
            }
            temp /= 10;
            place *= 10;
        }

        return num + 3 * pos;
    }
}
