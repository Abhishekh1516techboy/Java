// create TelePhone classs...
abstract class TelePhone{
    public void ring() {
        System.out.println("TelePhone ringing...");
    }

    public void lift() {
        System.out.println("TelePhone lift...");
    }

    public void disconnected() {
        System.out.println("TelePhone Disconnected...");
    }
}

// create SmartTelePhone class...
class SmartTelePhone extends TelePhone{
    
}

public class cwh_ch60_Pset_Abstract_and_Interface_Q4{
    public static void main(String[] args) {
        // Demonstrate Polymoriphism...
        TelePhone phone = new SmartTelePhone();
        phone.ring();
        phone.lift();
        phone.disconnected();
    }
}