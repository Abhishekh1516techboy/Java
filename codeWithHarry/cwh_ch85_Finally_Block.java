public class cwh_ch85_Finally_Block{

    public static int greet() {
        try {
            int a=50;
            int b=10;
            int c= a/b;
            return c;
        }
         catch (Exception e) {
            System.out.println(e);
        }

        finally{ //Always execute...
            System.out.println("Cleaning up resources...This is the End of Function...");
        }
        return -1;
    }

    public static void main(String[] args) {
      int g = greet();
      System.out.println("Greet(): "+g);

    //   -----------------------------------------
      int a =10;
      int b= 8;
      while (true) {
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println(e);
            break;
        }
        finally{ //Always execute...
            System.out.println("I am finally..."+b);
        }
        b--;
      }
    }
}