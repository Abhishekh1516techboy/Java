import Ac_24_sbiBank.Ac_24_OOPS_Bank;

// Pen class...
class Pens {
    public String color;
    public String type;

    // write method...
    public void write() {
        System.out.printf("This is a %s pen and its color is %s.", this.type, this.color);
    }

    // printColor method...
    public void printColor() {
        System.out.println(this.color);
    }

}

// Student class...
class Student1 {
    public String name;
    public int age;

    // studentInfo method...
    public void studentInfo() {
        System.out.println("Student name: " + this.name);
        System.out.println("Student Age: " + this.age + "\n");
    }

    // student constructor...
    public Student1() {
        System.out.println("This is Student constructor.");
    }

}

public class Ac_24_OOPS {
    public static void main(String[] args) {
        // Create objects of Pen class...
        Pens pen1 = new Pens();
        pen1.color = "Blue";
        pen1.type = "Gel";
        pen1.write();

        Pens pen2 = new Pens();
        pen2.color = "Black";
        pen2.type = "BallPoint";

        pen1.printColor();
        pen2.printColor();
        pen2.write();

        // Create objects of sbiBank.Student1 class...
        Student1 std1 = new Student1(); // Stdeent1...
        std1.name = "Abhishekh Kumar";
        std1.age = 21;
        std1.studentInfo();

        Student1 std2 = new Student1(); // Stdeent2...
        std2.name = "Roushan Kumar";
        std2.age = 22;
        std2.studentInfo();

        Student1 std3 = new Student1(); // Stdeent3..
        std3.name = "Vikash Kumar";
        std3.age = 20;
        std3.studentInfo();

        // use sbiBank...
        Ac_24_OOPS_Bank ac = new Ac_24_OOPS_Bank();
        ac.name = "TechBoy";
        System.out.println(ac.name);
        ac.setPassword("@AsusVivobook15");
        System.out.println(ac.getPassword());
        ac.printTable();

    }
}