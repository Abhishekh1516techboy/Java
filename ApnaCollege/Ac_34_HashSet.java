import java.util.HashSet;
import java.util.Iterator;

public class Ac_34_HashSet {
    public static void main(String[] args) {
//        HashSet creation...
        HashSet<Integer> set = new HashSet<>();

//      Insertion...
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);

//        Find Size...
        System.out.println("Size of element is: "+ set.size());

//        print All elements...
        System.out.println( "All element of Set: "+ set);

//        Iterator...
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

//        Searching...
        if (set.contains(1)){
            System.out.println("Yes its contains!");
        }

        if (!set.contains(7)){
            System.out.println("Does not contains!");
        }

//        Deletion...
        set.remove(1);
        if (!set.contains(1)){
            System.out.println("Does not contains 1 we deleted 1..");
        }


    }
}
