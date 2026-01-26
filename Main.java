import java.util.*;
import java.lang.* ;
import java.io.*;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        // int ko String me convert
        String s = String.valueOf(n);

        // check
        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }
    }
}
