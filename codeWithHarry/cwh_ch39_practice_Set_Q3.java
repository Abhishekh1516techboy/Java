// create square class
class Square{
    int side;

    public int area() {
        return side*side;
    }

    public int perimeter() {
        return 4*side;
    }
}

public class cwh_ch39_practice_Set_Q3{
    public static void main(String args[]) {
        Square sq = new Square();
        sq.side = 5;
        System.out.println("Area: " + sq.area());
        System.out.println("Perimeter: " + sq.perimeter());
    }
}