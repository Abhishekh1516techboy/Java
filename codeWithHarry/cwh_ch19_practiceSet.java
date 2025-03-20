import java.util.Scanner;
public class cwh_ch19_practiceSet {
    public static void main(String args[]) {
        String website;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter website Link:");
        website = sc.next();
        if (website.endsWith(".org")) {
            System.out.println("This is oraginational website.");
        }else if (website.endsWith(".com")) {
            System.out.println("This is comirical website.");
        }else if (website.endsWith(".in")) {
            System.out.println("This is Indian Website.");
        }
        sc.close();
    }
}