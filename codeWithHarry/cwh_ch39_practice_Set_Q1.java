// create class
class employees {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class cwh_ch39_practice_Set_Q1 {
    public static void main(String args[]) {
        // create objects of employee class
        employees abhi = new employees();
        abhi.salary = 25000;
        abhi.setName("Abhishekh1516techboy");
        System.out.println(abhi.getSalary());
        System.out.println(abhi.getName());
    }
}