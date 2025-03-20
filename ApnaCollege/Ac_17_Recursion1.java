public class Ac_17_Recursion1 {

    //        printReverseNum function...
    public static void printReverseNum(int num){
        if (num == 0){ //Base case...
            return;
        }
        System.out.println(num);
        printReverseNum(num-1);
    }

    //        printNum function...
    public static void printNum(int num){
        if (num == 11){ //Base case...
            return;
        }
        System.out.println(num);
        printNum(num+1);
    }

//    sumNatureNum function...
    public static void sumNatureNum(int i, int n,int sum){
        if (i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        sumNatureNum(i+1, n, sum);
    }

//    printFactorial function...
    public static int printFactorial(int n){
        if (n== 1 || n == 0){
            return 1;
        }

       int fact_nMinus1 = printFactorial(n-1);
       return n * fact_nMinus1;
    }

//    printFibonacci function...
    public static void printFibonacci(int a, int b, int n){
        if (n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFibonacci(b, c, n-1);
    }

//    calculatePower function
    public static int calculatePower(int x, int n){
        if (n == 0){ //base case 1
            return 1;
        }
        if (x == 0){ //base case 2
            return 0;
        }

    int x_Pow_N_minus1 = calculatePower(x, n-1);
    return x * x_Pow_N_minus1;
    }

    public static void main(String[] args) {
        System.out.println("printReverseNum");
        printReverseNum(10);
        System.out.println("printNum");
        printNum(1);
        System.out.println("sumNatureNum");
        sumNatureNum(1, 5, 0);
        System.out.println("printFactorial");
        System.out.println(printFactorial(5));
        System.out.println("printFibonacci");
        int a=0, b=1;
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        int n = 7;
        printFibonacci(a, b, n-2);
        System.out.println("calculatePower");
        System.out.println(calculatePower(2, 5));
    }
}
