// Method Overloading
public class cwh_ch32_MethodOverLoading_Ex2 {
    public static void foo() {
        System.out.println("Good morning Patna");
    }

    public static void foo(String name, int age) {
        System.out.println("good morning " + name + " " + age + " Bro");
    }

    public static void foo(String name, int age, int height) {
        System.out.println("good morning " + name + " " + age + " " + height + " Bro");
    }

    public static void main(String args[]) {
        foo();
        foo("abhishkeh", 21);
        foo("abhishkeh", 21, 5);
    }
}