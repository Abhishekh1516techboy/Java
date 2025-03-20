package Cwh_ch67_calc;

// create Calculator class...
class Calculator {
    public void Calculate(int a, int b) {
        System.out.println("your result is" + a + b);
    }
}

class ScCalculator {
    public void Calculate(int a, int b) {
        System.out.println("your result is" + Math.sin(a + b));
    }
}

class HyCalculator {
    public void Calculate(int a, int b) {
        System.out.println("your result is" + a + b);
        System.out.println("your result is" + Math.sin(a + b));
    }
}

public class cwh_ch67_Pset_Package_Access_Modifier_Q1 extends HyCalculator{
    public static void main(String[] args) {
        System.out.println("This is main method...");
        Calculator cal = new Calculator();
        cal.Calculate(5, 10);
        ScCalculator scal = new ScCalculator();
        scal.Calculate(4, 8);
        HyCalculator hcal = new HyCalculator();
        hcal.Calculate(8, 6);
    }
}