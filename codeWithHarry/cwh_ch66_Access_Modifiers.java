// create c1 class...
class C1{
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
    }
}

public class cwh_ch66_Access_Modifiers{
    public static void main(String[] args) {
        C1 c = new C1();
        // c.meth1();
        System.out.println(c.a);
        System.out.println(c.x);
        // System.out.println(c.y); you can't use private Access modifier in packages...
        System.out.println(c.z);
    }
}