
import java.util.Scanner;

public class cwh_ch81_handle_Specific_Exceptions {

    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 8;
        marks[1] = 42;
        marks[2] = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Index..");
        int ind = sc.nextInt();
        System.out.println("Enter the Number yoy want the divide the value with: ");
        int num = sc.nextInt();
        try {
            System.out.println("The value at array index entered is: " + marks[ind]);
            System.out.println("The value of array-value/number is: " + marks[ind] / num);
            sc.close();
        } catch (ArithmeticException e) {
            System.out.println("-----------------------------------------------------");
            System.out.println("ArithmeticException occurred\n" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("-----------------------------------------------------");
            System.out.println("ArrayIndexOutOfBoundsException occurred\n" + e);
        } catch (Exception e) {
            System.out.println("-----------------------------------------------------");
            System.out.println("Some other Exception occurred!\n" + e);
        }
    }
}
