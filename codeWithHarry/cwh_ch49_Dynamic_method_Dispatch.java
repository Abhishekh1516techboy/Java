// create one class...
class Phone {
    public void greet() {
        System.out.println("Good Morning Programmer...");
    }

    public void name() {
        System.out.println(" Keypad Phone ...");
    }
}

// create Tow class...
class Smartphone extends Phone {
    public void welcome() {
        System.out.println("Welcome in Android user...");
    }

    @Override
    public void name() {
        System.out.println("ScreenTouch Phone...");
    }
}

public class cwh_ch49_Dynamic_method_Dispatch {
    public static void main(String args[]) {
        // Phone obj = new Phone();
        // obj.name();
        Phone obj = new Smartphone();
        obj.name();
    }
}