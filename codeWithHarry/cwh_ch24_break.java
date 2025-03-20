public class cwh_ch24_break{
    public static void main(String args[]) {
        //Break statement using loops  
        for(int i = 1; i<10; i++){
            System.out.println(i);
            System.out.println("Java is a best language");
            if (i==5) {
                System.out.println("Ending theloop");                
                break;
            }
        }
    }
}