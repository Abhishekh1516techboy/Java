import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class cwh_ch112Adv_Pset2 {
    public static void main(String[] args) {

        // =========== code to write to a file...===========
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file name for Writing:");
        String wfName = scan.next();
        System.out.print("Enter number to print table: ");
        int i = scan.nextInt();
        String table= "";
        for (int j = 1; j <= 10; j++) {
            table += i+"x"+j+"="+(i*j);
            table +="\n";
        }
            try{
                FileWriter myFileWriter = new FileWriter(wfName);
                myFileWriter.write(table);
                System.out.println("Writing complete successfully...");
                myFileWriter.close();
            } catch (IOException e){
                System.out.println("Sorry you cannot be able to write anything in this file.");
                e.printStackTrace();
            }
            scan.close();
    }
}
