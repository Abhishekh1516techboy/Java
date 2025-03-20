public class cwh_ch33_varibleArguments {
    public static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String args[]) {
        System.out.println("Welcome to var Args tutorials");
        System.out.println("The sum of a + b= " + sum(8, 4));
        System.out.println("The sum of a + b + c= " + sum(8, 4, 3));
        System.out.println("The sum of a + b + c + d= " + sum(8, 4, 3, 5));
        System.out.println("The sum of a + b + c + d + e= " + sum(8, 4, 3, 5, 9));
    }
}