HashMap<Integer, Integer> map = new HashMap<>();
int prefixSum = 0;
int maxLen = 0;

map.put(0, -1);  // important base case

for (int i = 0; i < n; i++) {
    prefixSum += arr[i] - 1;

    if (map.containsKey(prefixSum)) {
        int len = i - map.get(prefixSum);
        maxLen = Math.max(maxLen, len);
    } else {
        map.put(prefixSum, i);
    }
}
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 1, 3, 2};

        int n = arr.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += arr[j];
                int len = j - i + 1;

                if (sum == len) {
                    maxLen = Math.max(maxLen, len);
                }
            }
        }

        System.out.println(maxLen);
    }
}
