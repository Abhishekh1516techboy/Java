import java.util.Scanner;

public class cwh_ch16_conditionals {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("Hurray You can drive cars and bikes");
        } else {
            System.out.println("Sorry you can't drive bikes bcz you are under 18");
        }
        sc.close();
    }
}