import java.util.Scanner;

public class cwh_ch34_recursion {
    // facctorial(0) = 1
    // factorial(n) = n*n-1*...1
    // factorial(5) = 5*4*3*2*1 = 120
    // factorial(n) = n*factorial(n-1)
    
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  number find Factorial:");
        int num = sc.nextInt();
        System.out.println("A value  of factorial " + num + " is " + factorial(num));
        sc.close();
    }
}