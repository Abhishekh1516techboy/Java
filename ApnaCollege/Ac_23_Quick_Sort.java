public class Ac_23_Quick_Sort {
//    partion function...
    public static int partion(int [] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot){
                i++;
//                Swapping...
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
//        Swapping with pivot...
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high]= temp;

        return i; //pivot index...
    }

//    quickSort function...
    public static void quickSort(int [] arr, int low, int high){
        if (low < high){
            int pivotIdx = partion(arr, low, high);
            quickSort(arr, low, pivotIdx-1);
            quickSort(arr, pivotIdx+1, high);
        }
    }

    public static void main(String[] args) {
        int [] arr = {3,8,4,9,7,1,6,5};
        int n = arr.length;

        quickSort(arr, 0, n-1);
//        print
        for(Object i: arr){
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}
