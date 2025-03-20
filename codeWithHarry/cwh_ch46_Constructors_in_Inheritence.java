// Create Base1 class...
class Base1 {

    // Create Constructor of Base1 class...
    public Base1() {
        System.out.println("I am a constructor of Base1 Class...");
    }

    // Overloading
    public Base1(int x) {
        System.out.println("I am an Overloaded constructor of Base1 Class... x " + x);
    }

}

// Create Derived1 class...
class Derived1 extends Base1 {

    // Create Constructor of Derived1 class...
    public Derived1() {
        // super(8);
        System.out.println("I am a constructor of Derived1 Class...");
    }

    public Derived1(int x, int y) {
        super(x);
        System.out.println("I am an Overloaded constructor of Derived1 Class... y " + y);
    }
}

// Create ChieldOfDerived class...
class ChieldOfDerived1 extends Derived1 {

    public void name() {
        System.out.println("hello");
    }

    // Create Constructor of ChieldOfDerived1 class...
    public ChieldOfDerived1() {
        System.out.println("I am a chield of ChieldOfDerived1 class...");
    }

    public ChieldOfDerived1(int x, int y, int z) {
        super(x, y);
        System.out.println("I am overloaded of ChieldOfDerived1 class... z " + z);
    }
}

public class cwh_ch46_Constructors_in_Inheritence {
    public static void main(String args[]) {
        // Base1 b = new Base1(5);
        // Derived1 d = new Derived1(8, 4);
        ChieldOfDerived1 cd = new ChieldOfDerived1(4, 6, 7);
        cd.name();
    }
}