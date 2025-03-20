public class Ac_6_AdvancePattern {
    public static void main(String[] args) {
//        Q.10 Butterfly star pattern...
//            Upper half..
        for (int i = 0; i <=5; i++) {
//            1st part...
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
//            spaces...
            int spaces = 2*(5-i);
            for (int j = 1; j <=spaces ; j++) {
                System.out.print("  ");
            }
//            2nd part...
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        Lower half...
        for (int i = 5; i >=1; i--) {
//            1st part...
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
//            spaces...
            int spaces = 2*(5-i);
            for (int j = 1; j <=spaces ; j++) {
                System.out.print("  ");
            }
//            2nd part...
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
//        Q.11 Print solid Rhombus...
        for (int i = 1; i <=5 ; i++) {
//            print Spaces...
            for (int j = 1; j <=5-i ; j++) {
                System.out.print("  ");
            }
//            print star...
            for (int j = 1; j <=5 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        Q.12 Number Pyramid...
        for (int i = 1; i <=5 ; i++) {
//            spaces...
            for (int j = 1; j <=5-i ; j++) {
                System.out.print(" ");
            }
//            Number...
            for (int j = 1; j <=i; j++) {
                System.out.print(i+"  ");
            }
            System.out.println();
        }

//        Q.13 Palindromic Pattern...
        for (int i = 1; i <=5 ; i++) {
//            spaces...
            for (int j = 1; j <=5-i ; j++) {
                System.out.print(" ");
            }
//            1st half number...
            for (int j = i; j >=1 ; j--) {
                System.out.print(j);
            }
//            2nd half number...
            for (int j = 2; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

//        Q.14 Diamond pattern...
//        upper half..
        for (int i = 1; i <=4 ; i++) {
//            spaces...
            for (int j = 1; j <=4-i ; j++) {
                System.out.print(" ");
            }
//            star...
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        Lower half..
        for (int i = 4; i >=1 ; i--) {
//            spaces...
            for (int j = 1; j <=4-i ; j++) {
                System.out.print(" ");
            }
//            Number...
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
