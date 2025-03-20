// create MyRunnableThread class...
class MyRunnableThread1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i<2000) {
        System.out.println("I am a Runnable thread 1");
        i++;
        }
    }
}

// create MyRunnableThread class...
class MyRunnableThread2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i<2000) {
        System.out.println("I am a Runnable thread 2");
        i++;
        }
    }
}

public class cwh_ch71_Create_Thread_using_RunnableThread {
    public static void main(String[] args) {
        MyRunnableThread1 bullet1 = new MyRunnableThread1();
        Thread gun1 = new Thread(bullet1);
        gun1.start();

        MyRunnableThread2 bullet2 = new MyRunnableThread2();
        Thread gun2 = new Thread(bullet2);
        gun2.start();
    }
}