// creating class
class MyEmployee {
    private int id;
    private String name;

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

public class cwh_ch40_AccessModifier_getter_Setter {
    public static void main(String args[]) {
        // creating objects of MyEmployee class
        MyEmployee abhi = new MyEmployee();

        // abhi.id = 05; --->> Throw an error due to using private access modifier...
        // abhi.name = "Abhishekh1516techboy";

        // set Attributes in MyEmployee class
        abhi.setName("Abhishekh1516techboy");
        abhi.setId(05);

        // Print Attributes values
        System.out.println(abhi.getName());
        System.out.println(abhi.getId());
    }
}