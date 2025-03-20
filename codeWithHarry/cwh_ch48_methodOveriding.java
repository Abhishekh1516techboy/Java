// create A class...
class A {
    public int a;

    public int mthd1() {
        return 1;
    }

    public void mthd2() {
        System.out.println("I am method no 2 of class A...");
    }
}

class B extends A {
    @Override
    public void mthd2() {
        System.out.println("I am method no 2 of class B...");
    }

    public void mthd3() {
        System.out.println("I am method no 3 of class B...");
    }
}

public class cwh_ch48_methodOveriding {
    public static void main(String args[]) {
        A a = new A();
        a.mthd2();

        B b = new B();
        b.mthd2();
        b.mthd3();
    }
}