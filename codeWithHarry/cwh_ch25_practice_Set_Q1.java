public class cwh_ch25_practice_Set_Q1{
    public static void main(String args[]) {
        int num = 4;
        for (int i = num; i>0; i--) {
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }     
    }
}