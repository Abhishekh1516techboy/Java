import java.util.Scanner;

public class Ac_12_Strings {
        public static void main(String[] args) {
                // input First name...
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter your first name:");
                String fName = sc.next();
                System.out.println("Your name is: " + fName);

                // input FullName name...
                Scanner newSc = new Scanner(System.in);
                System.out.print("Enter your full name:");
                String fullName = newSc.nextLine();
                System.out.println("Your name is: " + fullName);

                // Concatenation...
                String firstName = "Abhishekh";
                String lastName = "Kumar";
                String fulName = firstName + " " + lastName;
                System.out.println(fulName);
                // length...
                System.out.println("Length: " + fulName.length());
                // charAt...
                for (int i = 0; i < fulName.length(); i++) {
                        System.out.print(fulName.charAt(i) + " ");
                }
                // Compare...
                String name1 = "Abhishekh";
                String name2 = "Abhishekh";
                if (name1.compareTo(name2) == 0) {
                        System.out.println("\nStrings are equal...");
                } else {
                        System.out.println("\nString not equal...");
                }
                // subSring...
                String sentence = "hello my name is abhishekh kumar";
                String newSentence = sentence.substring(17, sentence.length());
                System.out.println(newSentence);
                sc.close();
                newSc.close();
        }
}
