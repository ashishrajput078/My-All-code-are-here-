import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

public class day_finder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int date = sc.nextInt();   // day
        int month = sc.nextInt();  // month
        int year = sc.nextInt();   // year

        LocalDate ld = LocalDate.of(year, month, date);
        DayOfWeek day = ld.getDayOfWeek();

        System.out.println(day); // Automatically in CAPITAL LETTERS
    }
}

