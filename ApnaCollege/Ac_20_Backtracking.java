public class Ac_20_Backtracking {
//    printPermutation function...
    public  static void printPermutation(String str, String perm, int idx ){

        if (str.isEmpty()){
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutation(newStr, perm + curChar, idx+1);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printPermutation(str, "", 0);
    }
}
