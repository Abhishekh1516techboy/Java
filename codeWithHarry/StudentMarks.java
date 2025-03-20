
// C.B.S.E Board Calculates Students Marks and Persentage
import java.util.Scanner;

public class StudentMarks {
        public static void main(String[] args) {
                int fulMarks;
                int h, e, m, s, c;
                int totMarks;
                float per;
                Scanner sc = new Scanner(System.in);
                System.out.println("-------------------------------------------");

                // prompt the user to enter the full marks
                System.out.print("Enter Full Marks: ");
                fulMarks = sc.nextInt();
                System.out.println("-------------------------------------------");

                // prompt the user to enter the marks of five subjects
                System.out.print("Enter Hindi Marks: ");
                h = sc.nextInt();
                System.out.print("Enter English Marks: ");
                e = sc.nextInt();
                System.out.print("Enter Math Marks: ");
                m = sc.nextInt();
                System.out.print("Enter Science Marks: ");
                s = sc.nextInt();
                System.out.print("Enter Computer Marks: ");
                c = sc.nextInt();

                // close the Scanner object
                sc.close();
                System.out.println("--------------------------------------------");

                // calculate the total marks by adding the marks of five subjects
                totMarks = h + e + m + s + c;

                // print the total marks
                System.out.println("Total MArks= " + totMarks);

                // calculate the percentage by dividing the total marks by the full marks and
                // multiplying by 100
                per = (float) totMarks / fulMarks * 100;

                // print the percentage
                System.out.println("Percentage= " + per);
                System.out.println("-------------------------------------------");

        }
}