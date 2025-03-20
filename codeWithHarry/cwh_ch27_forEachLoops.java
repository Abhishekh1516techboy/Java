public class cwh_ch27_forEachLoops{
    public static void main(String args[]) {
        int [] marks = {45,58,78,25,79};
        // float [] marks = {45.5f,58.5f,78.5f,25.5f,79.5f};
        // String [] students = {"Abhishekh","Aman","Ankit","Roushan","Vikash"};
        // System.out.println(students.length);        
        // System.out.println(students[3]);  

        System.out.println(marks.length);        
        System.out.println(marks[3]);

        System.out.println("Displaying using For Loop");
        // Displaying Arrays using For Loops
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        
        System.out.println("Displaying using forEach Loops");
        // Displaying Arrays using ForEach Loop
        for (int i : marks) {
            System.out.println(i);
        }

    }
}