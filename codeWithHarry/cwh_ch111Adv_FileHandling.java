import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class cwh_ch111Adv_FileHandling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // =========== Code to create New file...===========

        // System.out.println("Enter file name for creating:");
        // String cfName = scan.next();
        // File myFile = new File(cfName);
        // if (myFile.exists()){
        // System.out.println(myFile+" File already exists.");
        // }else {
        // try {
        // myFile.createNewFile();
        // System.out.println("New "+ myFile +" file is created.");
        // } catch (IOException e) {
        // System.out.println("Unable to create this file.");
        // e.printStackTrace();
        // }
        // }

        // =========== code to write to a file...===========

        // System.out.println("Enter file name for Writing:");
        // String wfName = scan.next();
        // File chekFile = new File(wfName);
        // if (chekFile.exists()){
        // Scanner newScan = new Scanner(System.in);
        // System.out.println("write here: ");
        // String writeFile = newScan.nextLine();
        // try{
        // FileWriter myFileWriter = new FileWriter(wfName);
        // myFileWriter.write(writeFile);
        // System.out.println("Writing complete successfully...");
        // myFileWriter.close();
        // } catch (IOException e){
        // System.out.println("Sorry you cannot be able to write anything in this
        // file.");
        // e.printStackTrace();
        // }
        // }else {
        // System.out.println(wfName+" File not found!");
        // }

        // =========== Code to Reading a file...==============

        // System.out.println("Enter file name for Reading:");
        // String rfName = scan.next();
        // try {
        // File myReadFile = new File(rfName);
        // Scanner sc = new Scanner(myReadFile);
        // while (sc.hasNextLine()){
        // String line = sc.nextLine();
        // System.out.println(line);
        // }
        // sc.close();
        // }
        // catch (FileNotFoundException e) {
        // System.out.println("This file cannot be able to Reading...");
        // e.printStackTrace();
        // }

        // =========== Code to Deleting a file...===========

        // System.out.println("Enter file name for Deleting:");
        // String dfName = scan.next();
        // File myDeleteFile = new File(dfName);
        // if (myDeleteFile.exists()){
        // myDeleteFile.deleteOnExit();
        // System.out.println("I have Deleted: "+ myDeleteFile.getName());
        // } else {
        // System.out.println("File not found!, file is already deleted.");
        // }

    }
}
