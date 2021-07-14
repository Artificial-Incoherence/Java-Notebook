class Function{
    static int multiply(int a, int b){
        return a*b;
    }

    int sum(int a, int b){
        return a+b;
    }
}

public class Qs4 {
    public static void main(String args[]) {
        Function obj= new Function();
        System.out.println(obj.sum(1,2));
        System.out.println(Function.multiply(1,2));

        System.out.println(obj.sum(3,5));
        System.out.println(Function.multiply(3,5));
    }
}

    

