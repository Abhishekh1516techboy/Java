import java.util.Scanner;

public class cwh_ch35_practiceSet_Metods_Q1 {
    public static void printTable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number print Table: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + i * num);
        }
        sc.close();
    }

    public static void main(String args[]) {
        printTable();
    }
}