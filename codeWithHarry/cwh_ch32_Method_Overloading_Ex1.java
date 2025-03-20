import java.util.Scanner;

public class cwh_ch32_Method_Overloading_Ex1 {

    // create static method...
    public static void tellJoke() {
        System.out.println("Tom And Jerry Is Frends..");
    }

    // create static method...
    public static void userName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name plz:");
        String name = sc.nextLine();
        System.out.println("Hello Mr." + name);
        sc.close();
    }

    // create static method...
    public static void change(int a) {
        a = 35;
    }

    // create static method...
    public static void change2(int[] arr) {
        arr[0] = 18;
    }

    public static void main(String[] args) {
        tellJoke();
        userName();
        int[] marks = { 85, 95, 75, 88, 65 };
        // case1. Changing the integer.
        int x = 45;
        change(x);
        System.out.println("the value of x after change is " + x);

        // case2. Changing the Array.
        change2(marks);
        System.out.println("the value of Array after change is " + marks[0]);
    }
}