//Create DemoAno interface...
interface DemoAno{
     void meths1();
     void meths2();
}

// create NewDemoAno interface...
@FunctionalInterface
interface NewDemoAno{
     void meths3();
}

public class cwh_ch109Adv_AnonyomusClass_LambdaExpression{
    public static void main(String[] args) {

        /*Anonymous Class...*/
        DemoAno obj1 = new DemoAno() { 
            @Override
            public void meths1(){
                System.out.println("I am meths1 from using Anonymous class...");
            }

            @Override
            public void meths2(){
                System.out.println("I am meths2 from using Anonymous class...");
            }
        };
        obj1.meths1();
        obj1.meths2();

         /*Lambda Expressions...*/
            NewDemoAno obj2 = ()-> System.out.println("I am meths3 from using lambda Expressions...");
            obj2.meths3();
    }
}