//create InvalidInputException Exception...
class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Cannot add 8 and 9";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

//create CannotDivideByZeroException Exception...
class CannotDivideByZeroException extends Exception{
    @Override
    public String toString() {
        return "Cannot Divide by Zero.";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

//create MaxInputException Exception...
class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "Input can't be greater then 100000..";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

//create CannotMultiplyException Exception...
class CannotMultiplyException extends Exception{
    @Override
    public String toString() {
        return "Cannot multiply greater then 7000..";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

//Create custom calculator class...
class CustomCalculator {

    public double addition(double a, double b)throws InvalidInputException, MaxInputException{

        if (a>100000 || b>100000){
            throw new MaxInputException();
        }

        if (a==8 || b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }
    public double substraction(double a, double b)throws  MaxInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a-b;
    }
    public double multiplication(double a, double b)throws  MaxInputException, CannotMultiplyException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }

        if (a>7000 || b>7000){
            throw new CannotMultiplyException();
        }
        return a*b;
    }
    public double division(double a, double b)throws CannotDivideByZeroException, MaxInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }

        if (b==0){
            throw new CannotDivideByZeroException();
        }
        return a/b;
    }
}

public class cwh_ch87_Custom_Calculator {
    public static void main(String[] args)throws InvalidInputException ,CannotDivideByZeroException, MaxInputException, CannotMultiplyException{
    CustomCalculator cusc = new CustomCalculator();
//    cusc.addition(7,9);
//    cusc.addition(7,100001);
        System.out.println("Addition: "+cusc.addition(5,4));
//        cusc.substraction(788,5);
        System.out.println("Subtract: "+cusc.substraction(88,6));
//    cusc.division(7,0);
        System.out.println("Division: "+cusc.division(70,5));
//    cusc.multiplication(7054,8);
        System.out.println("Multiply: "+cusc.multiplication(71, 5558965));

    }
}
