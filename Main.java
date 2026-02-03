import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 122333;

        int[] freq = new int[10]; // 0 to 9 digits

        while (n > 0) {
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }
    }
}
