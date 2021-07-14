public class Overload_3 {
    void compute(int len,char c){
        if(c=='s'){
            System.out.println("Square is: "+(len*len));
            }
        else 
            System.out.println("Cube is: "+(len*len*len));

    }
    void compute(double len,char v){
        if(v=='v') 
            System.out.println("Volume is: "+(len*len*len));
        else 
            System.out.println("Diagonal is:"+(Math.pow(((len*len)+(len*len)+(len*len)),0.5)));


    }
    void compute(int a,int b,char c){
        if(c=='a') 
            System.out.println("Area is: "+(a*b));
        else 
            System.out.println("Perimeter is: "+(2*(a+b)));
    }
    public static void main(String args[]){
        Overload_3 obj=new Overload_3();
        obj.compute(7,'s');
        obj.compute(7,'a');
        obj.compute(8.0,'v');
        obj.compute(3.0,'s');
        obj.compute(2,5,'a');
        obj.compute(6,3,'s');
    }

    
}
