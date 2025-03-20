import java.util.Scanner;

public class Ac_7_Functions {
//    Declaration printMyName function...
    public static void printMyName(String name){
        System.out.println(name);
    }
//    Declaration printSum function...
    public static int printSum(int a, int b){
        int sum = a+b;
        return sum;
    }
//    Declaration calculateProduct function...
    public static int calculateProduct(int a, int b){
        return a*b;
    }
//    Declaration printFactorial function...
    public static void printFactorial(int n){
        if (n<=0){
            System.out.println("Invalid Number...");
            return;
        }
       int factorial = 1;
        for (int i = n; i >=1 ; i--) {
            factorial = factorial*i;
            System.out.println(factorial);
        }
    }


    public static void main(String[] args) {

//        Call printMyName function...
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name here: ");
        String name = sc.nextLine();
        printMyName("Hello mr."+name);

//    Call printSum function...
        System.out.print("Enetr first numer: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = printSum(a,b);
        System.out.println("Add of "+a+" and "+b+" is: "+sum);

//      call calculateProduct function...
        System.out.println("Multiplication of "+a+" and "+b+" is: "+calculateProduct(a,b));

//        call printFactorial function...
        System.out.print("Enter number to find Factorial: ");
        int n = sc.nextInt();
        printFactorial(n);


        sc.close();
    }
}
