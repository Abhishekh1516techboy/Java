package Ac_24_sbiBank;

public class Ac_24_OOPS_Bank {

    public String name;
    protected String email;
    private String password;

    public void setPassword(String pass) {
        this.password = pass;
    }

    public String getPassword() {
        return password;
    }

    // printTable method...
    public void printTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("this is sbiBank.");
        Ac_24_OOPS_Bank ac = new Ac_24_OOPS_Bank();
        ac.name = "Abhishekh kumar";
        System.out.println("Name: " + ac.name);
        ac.email = "abhishekhkumar1516@gmail.com";
        ac.setPassword("@AsusVivobook15");
        System.out.println("Password: " + ac.getPassword());
        ac.printTable();
    }
}
