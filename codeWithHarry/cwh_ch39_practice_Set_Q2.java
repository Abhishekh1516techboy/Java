// creating CellPhone Class
class CellPhone {
    public void ringing() {
        System.out.println("Phone is Ringing");
    }

    public void callConnect() {
        System.out.println("Phone call is Connected");
    }

    public void callEnd() {
        System.out.println("Phone call is Disconnected");
    }

    public void batteryLow() {
        System.out.println("Phone Battery is Low");
    }

}

public class cwh_ch39_practice_Set_Q2 {
    public static void main(String args[]) {
        CellPhone Samsung = new CellPhone();
        Samsung.ringing();
        Samsung.callConnect();
        Samsung.callEnd();
        Samsung.batteryLow();
    }
}