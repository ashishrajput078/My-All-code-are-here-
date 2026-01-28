import java.util.*;

class frquency
 {
    public static void main(String[] args) {
        int num = 122333;

        int[] freq = new int[10]; // 0–9 digits ke liye

        while (num > 0) {
            int digit = num % 10;
            freq[digit]++;
            num = num / 10;
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " -> " + freq[i] + " times");
            }
        }
    }
}
