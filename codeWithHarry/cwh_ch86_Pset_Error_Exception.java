import java.util.Scanner;

// create MyErrorException Exception class...
class MyErrorException extends Exception {
    @Override
    public String getMessage() {
        return "\"Time UP\" You are entered 5 times...";
    }

    @Override
    public String toString() {
        return "\"Time UP\" You are entered 5 times...";
    }

}

public class cwh_ch86_Pset_Error_Exception {
    public static void main(String[] args) {
        // Q.1
        // int a = 7 Syntax Error...

        // int age = 56;
        // int year_born = 2000-78; Logical error...

        // System.out.println(6/0); Runtime error...

        // Q.2
        // try {
        // int a =666/0;
        // System.out.println(a);
        // } catch (IllegalArgumentException e) {
        // System.out.println("Hehe");
        // }
        // catch(ArithmeticException e){
        // System.out.println("HaHa");
        // }

        // Q.3
        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 71;
        marks[1] = 13;
        marks[2] = 45;
        Scanner sc = new Scanner(System.in);
        int indx;
        int i = 0;
        while (flag && i < 5) {
            try {
                System.out.print("Enter index number: ");
                indx = sc.nextInt();
                System.out.println("the value of marks[" + indx + "] is: " + marks[indx]);
                flag = false;
                sc.close();
            } catch (Exception e) {
                System.out.println("Invalid index");
                i++;
            }
        }
        // if (i==5) {
        System.out.println("\"Time UP\" You are entered 5 times...");
        // }
        try {
            if (i == 5) {
                throw new MyErrorException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}