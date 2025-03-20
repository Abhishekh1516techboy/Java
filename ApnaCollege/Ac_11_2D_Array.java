import java.util.Scanner;

public class Ac_11_2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows in array: ");
        int row = sc.nextInt();
        System.out.print("Enter number of column in array: ");
        int column = sc.nextInt();

//        Initialization of 2D-Array...
        int [][] numbers = new int[row][column];

//        Input code..
        System.out.println("Input numbers in 2D-Array...");
//        Row...
        for (int i = 0; i <row ; i++) {
//            column...
            for (int j = 0; j <column; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

//        Output code...
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

//        Searching elements...
        System.out.print("Enter number to find in Array: ");
        int x = sc.nextInt();
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < column; k++) {
                    if (numbers[j][k]==x){
                        System.out.println("Number found...");
                        System.out.println("Row: "+j+"\n"+"Column: "+k);
                    }
                }
            }
            sc.close();
    }
}
