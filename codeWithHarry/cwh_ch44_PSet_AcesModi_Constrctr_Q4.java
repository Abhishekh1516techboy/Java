// create class
class Rectangle{
    private int length;
    private int breadth; 

    // Create constructor of Rectaingle class
    public Rectangle(){
        this.length = 4;
        this.breadth = 5;
    }

    // Using MethodOverloading in constructor
    public Rectangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }

    // Use getter methods
    public int getLength(){
        return length;
    }

    public int getBreadth(){
        return breadth;
    }
}

public class cwh_ch44_PSet_AcesModi_Constrctr_Q4{
    public static void main(String args[]) {
        Rectangle ret = new Rectangle(8, 18);
        
        System.out.println(ret.getLength());
        System.out.println(ret.getBreadth());
    }
}