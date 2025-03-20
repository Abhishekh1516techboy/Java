import java.util.Scanner;

public class cwh_ch79_Syntax_Runtime_Logical_Errors {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        //  Logical Errors...
        // Write a program number to print all prime number between 1 se 100
        for (int i = 1; i < 5; i++) {
            System.out.println(2 * i + i);
        }
        //  Runtime Error...
            int k;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter numbers: "); //0
            k = sc.nextInt();
            System.out.println("Integer part of 1000 divided by k is: " + 1000/k);
            sc.close();
    }
}
