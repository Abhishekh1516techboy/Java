// create Abstract Base class...
abstract class Parent {

    // create constructor...
    public Parent() {
        System.out.println("This is Parent constructr...");
    }

    // create method...
    public void sayHello() {
        System.out.println("Hello");
    }

    // create Abstract method...
    abstract void greet();
    abstract void greet1();
}

// create child class...
class Child extends Parent {
    @Override
    void greet() {
        System.out.println("Good morning...");
    }

    @Override
    void greet1() {
        System.out.println("Good afternoon...");
    }
}

// create Abstract Baby class...
abstract class Baby extends Parent {
    public void good() {
        System.out.println("I am Good Method...");
    }
}

public class cwh_ch53_AbstractClass_Method {
    public static void main(String[] args) {
        Child c = new Child();
        c.sayHello();
        c.greet();
        c.greet1();
    }
}