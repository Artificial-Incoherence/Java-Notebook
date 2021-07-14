interface First{
    default void show(){
        System.out.println("Deafult method implementation of First interface");
        System.out.println("Deafult method implementation of First interface");

    }

}
interface Second{
     default void show(){
        System.out.println("Deafult method implementation of Second interface");
        System.out.println("Deafult method implementation of Second interface");

     }

}
class Display implements First,Second{
    public void show(){
        First.super.show();
        Second.super.show();

    }
}

public class Qs1{
    public static void main(String args []){

        Display obj=new Display();
        // System.out.println(obj.show());
        obj.show();

    
        
    
    
    
    }
}