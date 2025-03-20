// creating class
class MyNewEmployee {
    private int id;
    private String name;

    // create constructor of MyNewEmployee class...
    public MyNewEmployee() {
        this.id = 01;
        this.name = "your-name-here";
    }

    // using public methods
    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

public class cwh_ch42_constructors {
    public static void main(String args[]) {
        // create objects of class
        MyNewEmployee abhi = new MyNewEmployee();

        // set Attributes values
        // abhi.setName("Abhishekh1516techboy");
        // abhi.setId(05);

        // print Attributes values
        System.out.println(abhi.getName());
        System.out.println(abhi.getId());
    }
}