// create Abstract method...
abstract class Pen {
    abstract void write();

    abstract void refill();
}

// create FountainPen class...
class FountainPen extends Pen {
    @Override
    void write() {
        System.out.println("Write...");
    }

    @Override
    void refill() {
        System.out.println("Refill...");
    }

    public void changeNib() {
        System.out.println("Changing the Nib...");
    }
}

public class cwh_ch60_Pset_Abstract_and_Interface_Q1_Q2 {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.write();
        pen.refill();
        pen.changeNib();
    }
}