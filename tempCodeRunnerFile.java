import java.lang.Math;
abstract class Shape{
    abstract void RectangleArea(int length,int breadth);
    abstract void SquareArea(int side);
    abstract void CircleArea(double radius);

}
class Area extends Shape{
    void RectangleArea(int length, int breadth){
        System.out.println("Area of Rectangle: "+(length*breadth));
    

}
    void SquareArea(int side){
        System.out.println("Area of Square: "+(side*side));
    }
    void CircleArea(double radius){
        System.out.println("Area  of Circle: "+(2*Math.PI*radius));
    }
}
public class Main_4 {
    public static void main(String args []){
        Area obj=new Area();
        obj.RectangleArea(6, 9);
        obj.SquareArea(7);
        obj.CircleArea(13);
        
    }

}

