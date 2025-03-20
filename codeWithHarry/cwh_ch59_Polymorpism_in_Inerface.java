// create camera interface...
interface MyCamera1 {
    void clickPic();

    void recording();

    void takeSelfee();
}

// create Wifi Interface...
interface MyWifi1 {
    String[] getNetworks();

    void connectTONetwork(String network);
}

// create flashLight Interface...
interface MyFlashLight1 {
    void flashOff();

    void flashOn();
}

// create cellPhone class...
class MyCellPhone1 {

    // create method...
    public void calling(long phoneNum) {
        System.out.println("Calling " + phoneNum);
    }

    public void picCall() {
        System.out.println("connecting...");
    }

    public void endCall() {
        System.out.println("Call Disconnecterd...");
    }
}

// create smartphone class...
class MySmartphone1 extends MyCellPhone1 implements MyCamera1, MyWifi1, MyFlashLight1 {

    public void clickPic() {
        System.out.println("Picture clicked...");
    }

    public void recording() {
        System.out.println("Recording starts...");
    }

    public void takeSelfee() {
        System.out.println("Take selfee...");
    }

    public String[] getNetworks() {
        System.out.println("===============================");
        System.out.println("Getting List of Networks...");
        System.out.println("===============================");
        String[] networkList = { "Abhi", "TechBoy", "Roushan", "Golu" };
        return networkList;
    }

    public void connectTONetwork(String network) {
        System.out.println("--------------------------------");
        System.out.println("Connecting to: " + network);
        System.out.println("--------------------------------");
    }

    public void flashOff() {
        System.out.println("Flash Light Off...");
    }

    public void flashOn() {
        System.out.println("Flash Light ON...");
    }

}

public class cwh_ch59_Polymorpism_in_Inerface {
    public static void main(String[] args) {
        MyCamera1 cam1 = new MySmartphone1(); // This is a smartPhone but, use it as a camera...
        cam1.clickPic();
        cam1.recording();
        cam1.takeSelfee();
        // cam1.getNetworks();->> Not Allowed
    }
}