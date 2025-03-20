import java.util.ArrayList;
import java.util.Collections;

public class Ac_25_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
//                Add Element...
        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(7);
        list1.add(9);
        list1.add(4);
        list1.add(3);
        list1.add(10);
        list1.add(6);
        System.out.println("Original List Element: "+ list1);
//        get Element...
        int emem = list1.get(2);
        System.out.println("Get Element: "+emem);
//        Add Element in anywhere in indexes...
        list1.add(2, 5);
        System.out.println("Add New Element: "+ list1);
//        Set Element replace with current Element...
        list1.set(1, 8);
        System.out.println("Set New Element: "+ list1);
//        Delete Element...
        list1.remove(1);
        System.out.println(list1);
//        get Size of element...
        int size = list1.size();
        System.out.println("Size of Element: "+size);
//        for loops...
        System.out.println("print Element using Loops...");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + ",");
        }
//        forEach loops...
//        for (Object i: list1){
//            System.out.println(i+ ",");
//        }
        System.out.println();

//      sorting...
        Collections.sort(list1);
        System.out.print("Sorting Element: "+ list1);

    }
}
