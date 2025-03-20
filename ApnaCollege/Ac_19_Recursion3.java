public class Ac_19_Recursion3 {
//    printPer function...
    public static void printPer(String str, String permutation){
        if (str.isEmpty()){
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
//          "abc" -> "ab"
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPer(newStr, permutation + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printPer(str, "");
    }
}
