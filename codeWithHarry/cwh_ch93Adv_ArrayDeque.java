import java.util.*;

public class cwh_ch93Adv_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(11);
        ad1.add(42);
        ad1.add(64);
        ad1.add(66);
        ad1.add(33);
        ad1.addLast(77);

        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
