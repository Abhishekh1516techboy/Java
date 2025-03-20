// create camera interface...
interface MyCamera {
    void clickPic();

    void recording();

    void takeSelfee();
}

// create Wifi Interface...
interface MyWifi {
    String[] getNetworks();

    void connectTONetwork(String network);
}

// create flashLight Interface...
interface MyFlashLight {
    void flashOff();

    void flashOn();
}

// create cellPhone class...
class MyCellPhone {

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
class MySmartphone extends MyCellPhone implements MyCamera, MyWifi, MyFlashLight {

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

public class cwh_ch57_interface_DefaultMtehods {
    public static void main(String[] args) {
        MySmartphone ms = new MySmartphone();
        ms.calling(6204609187L);
        ms.picCall();
        ms.endCall();
        ms.clickPic();
        ms.recording();
        ms.takeSelfee();
        String[] ar = ms.getNetworks();
        for (String string : ar) {
            System.out.println(string);
        }
        ms.connectTONetwork("TechBoy");
        ms.flashOff();
        ms.flashOn();
    }
}