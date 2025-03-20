import java.time.LocalDate;
import java.time.LocalTime;

public class cwh_ch100Adv_Time_API {
    public static void main(String[] args) {
        LocalDate lod = LocalDate.now();
        System.out.println("Local Date: "+lod);

        LocalTime lot = LocalTime.now();
        System.out.println("Local Time: "+lot);

    }
}
