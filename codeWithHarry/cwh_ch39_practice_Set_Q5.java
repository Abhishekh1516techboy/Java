// create class
class Tommy {
    public void hit() {
        System.out.println("Hitting the Enemy");
    }

    public void run() {
        System.out.println("Running from thr Enemy");
    }

    public void fire() {
        System.out.println("Firing on the Enemy");
    }
}

public class cwh_ch39_practice_Set_Q5 {
    public static void main(String args[]) {
        // create objects of Tommy class
        Tommy tom = new Tommy();
        tom.hit();
        tom.run();
        tom.fire();
    }
}