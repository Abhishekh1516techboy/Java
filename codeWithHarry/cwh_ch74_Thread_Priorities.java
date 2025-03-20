// create NewThread class...
class NewThread extends Thread {

    // create constructor...
    public NewThread(String name) {
        super(name);
    }

    // create method...
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("I am NewThread..." + this.getName() + "\n");
            i++;
        }
    }
}

public class cwh_ch74_Thread_Priorities {
    public static void main(String[] args) {
        // Ready Queue: t1, t2, t3, t4, t5

        NewThread t1 = new NewThread("ABhi1");
        t1.start();

        NewThread t2 = new NewThread("ABhi2");
        t2.start();

        NewThread t3 = new NewThread("ABhi3");
        t3.start();

        NewThread t4 = new NewThread("ABhi4 (Most important!)");
        t4.start();
        t4.setPriority(Thread.MAX_PRIORITY);

        NewThread t5 = new NewThread("ABhi5");
        t5.start();

    }
}