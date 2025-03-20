class Base {
    private int x;

    public void print() {
        System.out.println("I am a Constructor");
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class Middle extends Base {
    int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

}

class Top extends Middle {
    int z;

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return z;
    }
}

public class cwh_ch45_Inheritance {
    public static void main(String args[]) {
        // create object of Base class...
        Base b = new Base();
        // Set Attributes
        b.setX(10);
        // Print Attrributes values
        b.print();
        System.out.println("Value of X: " + b.getX() + "\n");

        // create object of Middle class...
        Middle m = new Middle();
        // Set Attributes
        m.setX(10);
        m.setY(15);
        // Print Attrributes values
        m.print();
        System.out.println("value of X: " + m.getX());
        System.out.println("value of Y: " + m.getY() + "\n");

        // create object of Top class...
        Top t = new Top();
        // Set Attributes
        t.setX(10);
        t.setY(15);
        t.setZ(25);
        // Print Attrributes values
        t.print();
        System.out.println("value of X: " + t.getX());
        System.out.println("value of Y: " + t.getY());
        System.out.println("value of Z: " + t.getZ());
    }
}