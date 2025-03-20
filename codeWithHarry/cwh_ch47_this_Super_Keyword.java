// create a EkClass...
class EkClass {
    int a;

    // create constructor of EkClass...
    public EkClass(int a) {
        this.a = a;
    }

    // create method
    public int returnOne() {
        return 1;
    }

    // create Setter
    public int getA() {
        return a;
    }
}

// create DoClass...
class DoClass extends EkClass {

    public void name() {
        System.out.println("hello");
    }

    public DoClass(int c) {
        super(c);
        System.out.println("i am a Counstructor of DoClass...");
    }
}

public class cwh_ch47_this_Super_Keyword {
    public static void main(String args[]) {
        EkClass ekc = new EkClass(5);
        DoClass doc = new DoClass(4);
        System.out.println(ekc.getA());
        doc.name();
    }
}