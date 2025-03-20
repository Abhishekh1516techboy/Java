public class Ac_5_StarPattern {
    public static void main(String[] args) {
//        Q.1 print Rectangle star pattern...
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//       Q.2 print Hollow Rectangle star patterns...
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=5; j++) {
                    if (i==1 || j==1 || i==4 || j==5){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
            }
            System.out.println();
        }

//        Q.3 print Half Pyramid Star pattern...
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
                System.out.print(j);
            }
            System.out.println();
        }

//        Q.4 print Inverted Half Pyramid Star pattern...
        for (int i = 5; i >=1; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        Q.5 print Inverted Half Pyramid rotated 180 deg Star pattern...
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=5-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        Q.6 print floyd's triangle number print...
        int num =1;
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

//        Q.7 print 0-1 Triangle...
        for (int i = 1 ; i <=5; i++) {
            for (int j = 1; j<=i; j++) {
                if ((i+j)%2==0){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}
