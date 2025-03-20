//create GoodMorning class...
class GoodMorning extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                //Handle exceptions...
                System.out.println(e);
            }
            System.out.println("Good Morning...");
        }
    }
}

// create Welcome class...
class Welcome extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                //Handle exceptions...
                System.out.println(e);
            }
            System.out.println("Welcome...");
        }
    }
}

public class cwh_ch76_Pset_Thread {
    public static void main(String[] args) {
        GoodMorning gm = new GoodMorning();
        gm.start();
        // gm.setPriority(8);
        // System.out.println(gm.getPriority() );
        
        Welcome wc = new Welcome();
        wc.start();
        // System.out.println(wc.getState());
        // wc.setPriority(9);
        // System.out.println(wc.getPriority() );
        System.out.println(Thread.currentThread().getState());
    }
}