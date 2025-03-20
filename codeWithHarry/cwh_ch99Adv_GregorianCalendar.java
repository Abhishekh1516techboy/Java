import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class cwh_ch99Adv_GregorianCalendar {
    public static void main(String[] args) {
        Calendar cl = Calendar.getInstance();
        System.out.println("Date: "+cl.get(Calendar.DATE));
        System.out.println("Time: "+cl.getTime());
        System.out.println("Hours: "+cl.get(Calendar.HOUR));
        System.out.println("Minutes: "+cl.get(Calendar.MINUTE));
        System.out.println("Second: "+cl.get(Calendar.SECOND));
        System.out.println("MileSecond: "+cl.get(Calendar.MILLISECOND));
        System.out.println("CustomDate: "+cl.get(Calendar.HOUR_OF_DAY)+":"+cl.get(Calendar.MINUTE)+":"+cl.get(Calendar.SECOND));

        GregorianCalendar gcl = new GregorianCalendar();
        System.out.println("Is Leap Year: "+gcl.isLeapYear(2024));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
        System.out.println(TimeZone.getAvailableIDs()[4]);
        System.out.println(TimeZone.getAvailableIDs()[5]);
    }
}
