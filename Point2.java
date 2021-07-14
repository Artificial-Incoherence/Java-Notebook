class Point {
    double x,y;
    Point(double x,double y){
        this.x=x;
        this.y=y;

    }   
}
class Point2{
    void distance(Point p1, Point p2){
        
        double distance =Math.sqrt((p2.x-p1.x)*(p2.x-p1.y) + (p2.y-p1.y)*(p2.y-p1.y));
        System.out.println(distance);
    }
    public static void main(String args []){
        Point p1= new Point(7,3);
        Point p2=new Point(5,6);
        Point2 obj=new Point2();
        obj.distance(p1,p2);
    
    }

}
