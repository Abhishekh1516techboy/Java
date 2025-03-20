public class Ac_13_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Abhishekh");
        System.out.println(sb);
//        get char at index 0...
        System.out.println(sb.charAt(0));
//        set char at index 0...
        sb.setCharAt(0, 'k');
        System.out.println(sb);
//        insert...
        sb.insert(0, 'A');
        System.out.println(sb);
//        Delete the extra 'h'...
        sb.delete(1,2);
        System.out.println(sb);
        sb.delete(4,9);
        System.out.println(sb);
//        Append...
        sb.append('n');
        sb.append('a');
        sb.append('s');
        sb.append('h');
        System.out.println(sb);
        System.out.println(sb.length());
//        reverse...
        for (int i = 0; i < sb.length()/2; i++) {
            int front =i;
            int back = sb.length()-1-i; //5-1-0 = 4
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
