// create MyThread1 class...
class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i<2000) {
            System.out.println("My Thread 1 is running");
            System.out.println("I am Happy");
            i++;
        }
    }
}

// create MyThread2 class...
class MyThread2 extends Thread {
    @Override
    public void run() {
        int i =0;
        while (i<2000) {
            System.out.println("My Thread 2 is running");
            System.out.println("I am Happy");
            i++;
        }
    }
}

public class cwh_ch70_Create_Threads_using_ExtendingThread {
    public static void main(String[] args) {
        MyThread1 mth1 = new MyThread1();
        mth1.start();
        MyThread2 mth2 = new MyThread2();
        mth2.start();
    }
}