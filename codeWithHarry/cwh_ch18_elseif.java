import java.util.Scanner;
public class cwh_ch18_elseif{
    public static void main(String args[]) {
        int age;
        System.out.print("Enter your age plz:");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56) {
            System.out.println("You are experienced!");
        }else if (age>45) {
            System.out.println("you are semi-experienced!");
        }else{
            System.out.println("You are not experienced!");
        }
        sc.close();
    }
}