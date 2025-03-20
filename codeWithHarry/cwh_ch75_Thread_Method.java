// create NewThread1 class...
class NewThread1 extends Thread {

    // create method...
    public void run() {
        int i = 0;
        while (i<100) {
            System.out.println("I am NewThread 1...");
            try {
            Thread.sleep(1500);
            } catch (Exception e) {
                System.out.println(e);
            }
            i++;
        }
    }
}

// create NewThread2 class...
class NewThread2 extends Thread {

    // create method...
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("I am NewThread 2...");
            i++;
        }
    }
}

public class cwh_ch75_Thread_Method {
    public static void main(String[] args) {
        NewThread1 nth1 = new NewThread1();
        nth1.start();

        // try {
        //     nth1.join();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }

        // NewThread2 nth2 = new NewThread2();
        // nth2.start();
    }
}