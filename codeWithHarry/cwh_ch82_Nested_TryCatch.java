
import java.util.Scanner;

public class cwh_ch82_Nested_TryCatch {

    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 8;
        marks[1] = 18;
        marks[2] = 5;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("Enter the value of Array Index:");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to video number 82...");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                    sc.close();
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this Index does not exists...\n" + e);
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for using this program...");
    }
}
