public class cwh_ch29_practiceSet_ch6_Q1{
    public static void main(String args[]) {
        float [] marks = {45.5f,65.7f,48.3f,75.2f,65.5f};
        float  sum = 0;
        for (float element: marks) {
            System.out.println(element);
            sum = sum + element;
        }
        System.out.println("Total Adition:"+sum);
    }
}