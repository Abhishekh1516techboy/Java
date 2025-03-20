public class Ac_16_Sorting {

//    printArray function...
    public static void printArray(int [] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {7,8,3,1,9,11,17,2};

//        Time complexity = O(n^2) times...
//       1. Bubble Sort...
        for (int i = 0; i <arr.length-1 ; i++) { // n-1 times
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]){
//                    Swap...
                    int temp1 = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp1;
                }
            }
        }
        System.out.println("Bubble sorting...");
        printArray(arr);

//        Time complexity = O(n^2) times...
//        2. Selection sort...
        for (int i = 0; i < arr.length-1; i++) {
            int smallElem = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[smallElem] > arr[j]){
                    smallElem = j;
                }
            }
            int temp2 = arr[smallElem];
            arr[smallElem] = arr[i];
            arr[i] = temp2;
        }
        System.out.println("Selection sorting...");
        printArray(arr);

//        Time complexity = O(n^2) times...
//        Insertion sort...
        for (int i = 1; i < arr.length; i++) {
            int currentArray = arr[i];
            int j = i-1;
            while (j >= 0 && currentArray < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
//            Placement...
            arr[j+1] = currentArray;
        }
        System.out.println("Insertion sorting...");
        printArray(arr);
    }
}
