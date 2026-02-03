public class MAX_FREQ {
    public static void main(String[] args) {
        int n = 122333;
        int[] freq = new int[10];

        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }

        int maxDigit = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > freq[maxDigit]) {
                maxDigit = i;
            }
        }

        System.out.println("Max freq digit = " + maxDigit);
    }
}
