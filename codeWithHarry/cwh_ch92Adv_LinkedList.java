import java.util.*;

public class cwh_ch92Adv_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(18);
        l2.add(38);
        l2.add(46);
        l2.add(24);
        l2.add(41);

        l1.add(5);
        l1.add(3);
        l1.add(1, 7);
        l1.add(3);
        l1.add(2, 6);
        l1.addLast(777);

        l1.addAll(0, l2); // Add elements in starting...
        // l1.addAll(l2); //Add elements in ends...
        // l1.clear(); //delete all elements...

        System.out.println("\n" + l1.contains(58));
        System.out.println("Index Of: " + l1.indexOf(3));
        System.out.println("LastIndex Of: " + l1.lastIndexOf(3));
        System.out.println("Remove: " + l2.remove(2));
        System.out.println("Value of Index: " + l1.get(1));
        // l1.set(1, 586);

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
