package codeWithHarry.gym;

public class HarryGym{
    int a = 8;
    public int x = 5;
    private int y = 66;
    protected int z = 45;

    // create meth1 method...
    public void meth1() {
        System.out.println(a);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        int i = 1;
        System.out.println("table");
        while (i<=10) {
            System.out.println(i);            
            i++;
        }

    }
    public static void main(String[] args) {
        System.out.println("i am harry gym package...");
    }
}