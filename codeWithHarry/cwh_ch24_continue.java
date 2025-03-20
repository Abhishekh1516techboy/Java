public class cwh_ch24_continue {
    public static void main(String args[]) {
        for(int i = 1; i<10; i++){
            System.out.println(i);
            System.out.println("Java is a best language");
            if (i==5) {
                System.out.println("Ending theloop");                
                continue;
            }
            System.out.println("hello india");
        }
    }
}
