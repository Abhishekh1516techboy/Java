import java.util.Scanner;

public class TakingInput {
    public static void main(String args[]) {
        System.out.println("Add two Numbers...\n----------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();
        sc.close();

        int Add = num1 + num2;
        System.out.println("----------------------\nAddition =" + " " + Add);

    }
}