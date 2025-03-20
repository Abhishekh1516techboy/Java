public class Ac_15_Bit_Manipulation {
    public static void main(String[] args) {
//        AND perform &...
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;
        if ((bitMask & n) == 0){
            System.out.println("Bit was Zero...");
        }else {
            System.out.println("Bit was one...");
        }
//        OR perform |...
        int newNum = bitMask | n;
        System.out.println(newNum);
//        AND perform with NOT & v/s ~...
        int notBitMask = ~(bitMask);
        int newMaskNum = notBitMask & n;
        System.out.println(newMaskNum );
    }
}
