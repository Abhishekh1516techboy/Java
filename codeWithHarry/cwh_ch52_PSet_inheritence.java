// create circle class...
class Circle {
    public int radius;

    // create constructor...
    public Circle(int r) {
        System.out.println("I am circle parametrised constructor...");
        this.radius = r;
    }

    // create method
    public double area() {
        return Math.PI * this.radius * this.radius;
    }

}

// create Cylinder class...
class Cylinders extends Circle {
    public int height;

    // create constructor...
     Cylinders(int r , int h) {
        super(r);
        System.out.println("I am cylinder paramertised conctructor...");
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class cwh_ch52_PSet_inheritence {
    public static void main(String[] args) {
        Cylinders cyl = new Cylinders(5,8);
        System.out.println("Area of circle: "+cyl.area());
        System.out.println("Volume of cylinder: "+cyl.volume());
    }
}