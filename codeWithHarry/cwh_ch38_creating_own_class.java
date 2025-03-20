// Creating Employee Class
class employee {
    int id; // attribute 1
    int salary;
    String name; // attribute 2

    public void printDetails() {
        System.out.println("My id is: " + id);
        System.out.println("My Salary is: " + salary);
        System.out.println("And UserName is: " + name);
        System.out.println();
    }
}

public class cwh_ch38_creating_own_class {
    public static void main(String args[]) {
        System.out.println("This is our custom class");
        System.out.println("------------------------------");

        // Creating objects of Employee Class
        employee abhi = new employee(); // Insantating a new Employee object
        employee ankit = new employee(); // Insantating a new Employee object
        employee aman = new employee(); // Insantating a new Employee object
        employee roushan = new employee(); // Insantating a new Employee object

        // Set Attributes in Employee class
        abhi.id = 105;
        abhi.salary = 25000;
        abhi.name = "Abhishekh1516techboy";

        ankit.id = 113;
        ankit.salary = 30900;
        ankit.name = "Ankit Kumar";

        aman.id = 112;
        aman.salary = 42800;
        aman.name = "Aman Khan";

        roushan.id = 115;
        roushan.salary = 36500;
        roushan.name = "Roushan Kumar";

        // Printing the Attributes
        abhi.printDetails();
        ankit.printDetails();
        aman.printDetails();
        roushan.printDetails();
    }
}