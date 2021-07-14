import java.util.Scanner;

class Shape {
    double length,breadth;
    Shape(double l,double b){
        length=l;
        breadth=b;
    }
    Shape(double l){
        length=breadth=l;
    }
    double calculate(){
        return length*breadth;
    }
    
}
class Test1 extends Shape{
    double height;
    Test1(double length,double breadth,double h){
        super(length,breadth);
        height=h;


    }
    Test1(double length,double h){
        super(length);
        height=h;
    }
    
    double calculate(){
        return length*breadth*height;
    }
public static void main(String args []){

    double vol1,vol2;
    Scanner s = new Scanner(System.in);
    double length=s.nextDouble();
    double breadth=s.nextDouble();
    double height=s.nextDouble();
    Test1 shape1=new Test1(length,height);
    Test1 shape2=new Test1(length,breadth,height);
    vol1=shape1.calculate();
    vol2=shape2.calculate();
    System.out.println(vol1);
    System.out.println(vol2);
    s.close();
    
    
    }
    
}




       

