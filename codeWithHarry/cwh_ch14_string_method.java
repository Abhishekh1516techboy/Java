public class cwh_ch14_string_method {

    public static void main(String args[]) {
        System.out.println();
        String myName = "Abhishekh";
        System.out.println(myName);
        System.out.println(myName.startsWith("Abh"));
        System.out.println(myName.endsWith("ekh"));
        System.out.println(myName.charAt(1));
        System.out.println(myName.indexOf("ekh"));
        System.out.println(myName.lastIndexOf("k"));

        String nonTrimString = "          Abhishekh   ";
        System.out.println(nonTrimString);
        String trimmString = nonTrimString.trim();
        System.out.println(trimmString.length());
    }
}