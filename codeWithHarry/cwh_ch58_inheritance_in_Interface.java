// create sample interface..
interface SampleInterface {
    void meth1();

    void meth2();
}

// create childSample interface..
interface ChildInterface extends SampleInterface {
    void meth3();

    void meth4();
}

// Create MySample Class...
class MySampleClass implements ChildInterface {
    public void meth1() {
        System.out.println("Alean is Alive in Space...");
    }

    public void meth2() {
        System.out.println("DainaSour is alive....");
    }

    public void meth3() {
        System.out.println("cars are flying..");
    }

    public void meth4() {
        System.out.println("Ghost is Alive...");
    }
}

public class cwh_ch58_inheritance_in_Interface {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}