// create MyThread class...
class MyThread extends Thread {

    // create constructor...
    public MyThread(String name) {
        super(name);
    }

    // create method...
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("I am Thread...");
            i++;
        }
    }
}

public class cwh_ch73_Thread_constructor {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("Abhishekh");
        mt1.start();

        MyThread mt2 = new MyThread("Roushan");
        mt2.start();
        System.out.println("The id of the mt is: " + mt1.getName());
        System.out.println("The id of the mt is: " + mt1.threadId());
        System.out.println("The id of the mt is: " + mt2.getName());
        System.out.println("The id of the mt is: " + mt2.threadId());
    }
}