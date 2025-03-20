import java.util.Scanner;
//create a MyAgeException class...
class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

//create a MaxAgeException class...
class MaxAgeException extends Exception{
    @Override
    public String toString() {
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "make sure that the value of age entered is correct";
    }
}

public class cwh_ch83_Exception_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        if (a<99){
            try {
            throw new MyException();
//            throw new ArithmeticException("This is an Exception...");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("finished...");
            }
            System.out.println("Program finished...");
        }

            boolean flag = true;
           while (flag){

               System.out.print("Enter your age: ");
               int age = sc.nextInt();
               if (age>125){
                   try {
                       throw new MaxAgeException();
                    }
                   catch (Exception e){
                       System.out.println(e.getMessage());
                       System.out.println(e);
                   }
               }
               else {
                   flag = false;
               }
           }
    }
}
