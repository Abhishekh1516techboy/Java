// create Cylinder class
class Cylinder {
    private int height;
    private int radius;

    // Create Constructor of cylinder class
    // public Cylinder() {
    // this.height = 5;
    // this.radius = 6;
    // }

    // using public methods
    public void setHeight(int h) {
        this.height = h;
    }

    public int getHeight() {
        return height;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public double surfaceOfCylinder() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double volumeOfCylinder() {
        return Math.PI * radius * radius * height;
    }

}

public class cwh_ch44_PSet_AcesModi_Constrctr_Q1_2_3 {
    public static void main(String args[]) {

        // create obj of Cylinder class
        Cylinder cyl = new Cylinder();

        // Set Attributes
        cyl.setHeight(12);
        cyl.setRadius(9);

        // Print Attributes values
        System.out.println("Height of Cylinder: " + cyl.getHeight());
        System.out.println("Radius of Cylinder: " + cyl.getRadius());
        System.out.println("Surface of Cylinder: " + cyl.surfaceOfCylinder());
        System.out.println("Surface of Cylinder: " + cyl.volumeOfCylinder());
    }
}