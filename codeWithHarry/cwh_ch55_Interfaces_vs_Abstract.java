// Create  Bycycle Interface...
interface Bycycle {
    void applyBreak(int decrement);

    void speedUp(int increment);
}

interface HornBycycle {
    void blowHorn();

    void ppHorn();
}

// create HeroCycle class...
class HeroCycle implements Bycycle, HornBycycle {
    public void applyBreak(int decrement) {
        System.out.println("Applying break...");
    }

    public void speedUp(int increment) {
        System.out.println("Applying SpeedUP...");
    }

    public void blowHorn() {
        System.out.println("pooo pooo pooo...");
    }

    public void ppHorn() {
        System.out.println("ppp ppp ppp...");
    }
}

public class cwh_ch55_Interfaces_vs_Abstract {
    public static void main(String[] args) {
        HeroCycle hero = new HeroCycle();
        hero.speedUp(20);
        hero.applyBreak(20);
        hero.blowHorn();
        hero.ppHorn();
    }
}