import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_ch101Adv_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now(); // Current Date...
        System.out.println(ldt);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yy - E"); // This is Formatter...
        String MyDate = ldt.format(dtf1); //Create Date string using LocalDateTime and Formatter...
        System.out.println(MyDate);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm:ss - a"); // This is Formatter...
        String MyTime = ldt.format(dtf2); //Create Time string using LocalDateTime and Formatter...
        System.out.println(MyTime);
    }
}
