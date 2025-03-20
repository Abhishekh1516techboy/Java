import java.time.LocalTime;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.HashSet;

public class cwh_ch102Adv_Pset1 {
    public static void main(String[] args) {

//        Q.1...
        ArrayList<String> arl = new ArrayList<>();
        arl.add("Abhishkeh Kumar");
        arl.add("Amanullaha Khan");
        arl.add("Ankit Kumar");
        arl.add("Roushan Kumar");
        arl.add("Ashutosh kumar");
        arl.add("Sahil kumar");
        arl.add("Sagar kumar");
        arl.add("Rajkumar");
        arl.add("Aman kumar");
        arl.add("Kundan kumar");

        for (Object o: arl){   //ForEach Loop...
            System.out.println(o);
        }

//        Q.2...
        LocalDateTime ldt = LocalDateTime.now(); // Current Date...

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm:ss - a"); // This is Formatter...
        String MyTime = ldt.format(dtf2); //Create Time string using LocalDateTime and Formatter...
        System.out.println(MyTime);

//        Q.3...
        Calendar cl = Calendar.getInstance();
        System.out.println("CustomDate: "+cl.get(Calendar.HOUR_OF_DAY)+":"+cl.get(Calendar.MINUTE)+":"+cl.get(Calendar.SECOND));

//        Q.4...
        LocalTime lot = LocalTime.now();
        System.out.println("Local Time: "+lot);

//        Q.5...
        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(25);
        hs.add(55);
        hs.add(64);
        hs.add(46);
        hs.add(46);
        hs.add(46);

        System.out.println(hs);
    }
}
