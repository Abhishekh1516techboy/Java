import codeWithHarry.gym.HarryGym;

// create using class...
class usings extends HarryGym {
    public void meth2() {
        // System.out.println(a);
        System.out.println(x);
        // System.out.println(y);
        System.out.println(z);
    }
}

public class cwh_ch65_PackageUsing {
    public static void main(String[] args) {
        HarryGym c = new HarryGym();
        // System.out.println(c.a);
        System.out.println("this is harry: " + c.x);
        // System.out.println(c.y);
        // System.out.println(c.z);

        System.out.println("meth1");
        c.meth1();

        System.out.println("meth2");
        usings us = new usings();
        us.meth2();
    }
}