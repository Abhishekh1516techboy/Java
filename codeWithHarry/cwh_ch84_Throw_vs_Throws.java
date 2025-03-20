
//create  NegativeRadiusException Exception...
class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be Negative..";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be Negative..";
    }
}

//========================================================
public class cwh_ch84_Throw_vs_Throws {

// create static method...
    public static int divide(int a, int b) throws ArithmeticException{
//        Made by Abhi...
        int result = a/b;
        return result;
    }

// create static method...
    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new  NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }

    public static void main(String[] args) {
//        Shivam - uses divide function created by Abhi...
        try {
        int c = divide(6,0);
        System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Exception "+e);
        }

        try {
            double ar = area(0);
            System.out.println("d = " + ar);
        }
        catch (Exception e){
            System.out.println("Exception "+e);
        }
    }
}
