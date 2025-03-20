public class cwh_ch26_arrays{
    public static void main(String[] args) {
         /* classrooms of 500 students:
         # you have 2 options:
         1.create 500 variables 
         2.use Arrays (Recommended) 
         */

        //  There are 3 ways to create an Array in Java
        // ---------------------------------------------
        // 1st--> int [] arr = new int [5];
        // 2nd--> int [] arr;
        //        arr = ner int [5]; 
        // 3rd--> int [] arr = {65,88,78,48,95};

        int [] marks = new int[5];
        marks[0] = 64;
        marks[1] = 55;
        marks[2] = 45;
        marks[3] = 58;
        marks[4] = 50;
        System.out.println(marks[1]);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(i);
        }
    }
}