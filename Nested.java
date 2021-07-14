class ICARE{

    class Hit{
        public void cse(){
            System.out.println("This is CSE");

        }
        public void ece(){
            System.out.println("This is ECE");

        }
        public void ee(){
            System.out.println("This is EE");

        }
        public void me(){
            System.out.println("This is ME");

        }

    }
}
public class Nested{
    public static void main(String args []){
    
        ICARE.Hit obj = new ICARE().new Hit();
        obj.cse();
        obj.ece();
        obj.ee();
        obj.me();

    
    
    
    }
}