// write recursive  function and find sum of first natural numbers
public class cwh_ch35_practiceSet_methods_Q2 {
   public static int sumRecursiveFun(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursiveFun(n - 1);
    }

    public static void main(String args[]) {
        int c = sumRecursiveFun(5);
        System.out.println(c);
    }
}