import java.util.*;

public class rotating{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int last = n % 10;
        int rest = n / 10;

        int pow = 1;
        int t = rest;

        while (t > 0) {
            pow = pow * 10;
            t = t / 10;
        }

        int rotated = last * pow + rest;
        System.out.println(rotated);
    }
}
