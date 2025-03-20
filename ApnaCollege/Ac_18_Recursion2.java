public class Ac_18_Recursion2 {

//    towerOfHanoi function...
    public static void towerOfHanoi(int n, String src, String hlpr, String dest){
        if (n == 1){
            System.out.println("Transfer disk "+n+" From "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, hlpr);
        System.out.println("Transfer disk "+n+" From "+src+" to "+dest);
        towerOfHanoi(n-1, hlpr, src, dest);
    }

// printReverse function...
public static void printReverse(String str, int idx){
        if (idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
    System.out.print(str.charAt(idx)+" ");
    printReverse(str, idx-1);
}

// printKeyCombination function...
    public static String [] keypad = {".","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void printKeyCombination(String str, int idx, String compination){
        if (idx == str.length()){
            System.out.print(compination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printKeyCombination(str, idx+1, compination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        System.out.println("towerOfHanoi");
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
        System.out.println("printReverse");
        String str = "abcde";
        printReverse(str, str.length()-1);
        System.out.println("printKeyCombination");
        String str2 = "7";
        printKeyCombination(str2, 0, "" );
    }
}
