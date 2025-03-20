import java.util.Scanner;
public class cwh_ch18_switchCase{
    public static void main(String args[]) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        ch = sc.next().charAt(0);
        switch (ch) {
            case 'A','E','I','O','U':
            case 'a','e','i','o','u':
                System.out.println("You are Entered Vowel!");
                break;
            default:
                System.out.println("you are Entered Constant!");
                break;
        }
        sc.close();
    }
}