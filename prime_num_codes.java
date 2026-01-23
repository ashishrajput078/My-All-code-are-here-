import java.util.*;

public class prime_num_codes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("not prime");
            
        }

        int count = 0;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }

        if (count == 0) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
