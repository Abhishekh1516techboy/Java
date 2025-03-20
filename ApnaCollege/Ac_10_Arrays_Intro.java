import java.util.Scanner;

public class Ac_10_Arrays_Intro {
    public static void main(String[] args) {
//      Initialization of Array...
        int [] marks = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter math marks: ");
        int math = sc.nextInt();
        System.out.println("Enter English marks: ");
        int eng = sc.nextInt();
        System.out.println("Enter Hindi marks: ");
        int sci = sc.nextInt();
        System.out.println("Enter Science marks: ");
        int hindi = sc.nextInt();
        System.out.println("Enter Social science marks: ");
        int sst = sc.nextInt();

        marks[0]=math;
        marks[1]=eng;
        marks[2]=hindi;
        marks[3]=sci;
        marks[4]=sst;

//      print marks of Array...
        for (Object i: marks ){
            System.out.println(i);
        }

        System.out.println("Enter number to find in array: ");
        int x = sc.nextInt();
        for (int i = 0; i <marks.length; i++) {
            if (marks[i]==x){ //Linear search...
                System.out.println("Number found at Index no: "+i);
            }
        }
        sc.close();
    }
}
