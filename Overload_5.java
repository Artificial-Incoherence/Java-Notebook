public class Overload_5 {
    void polygon(int n, char ch){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(ch);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    void polygon(int a, int b){
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print('@');
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    void polygon(){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    public static void main(String args[]){
        Overload_5 obj=new Overload_5();
        obj.polygon(4,'t');
        obj.polygon(6,4);
        obj.polygon();
    }
        
    
}
