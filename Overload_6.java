public class Overload_6 {
    void compare(int x, int y)
    {
        System.out.println("Larger number is: "+(x>y?x:y));
        }
        void compare(char a, char b){
        System.out.println("Larger character is: "+(a>b?a:b));
        }
        void compare(String t, String h){
        System.out.println("Longer string is:"+(t.length()>h.length()?t:h));
    }
    public static void main(String args[])
    {
        Overload_6 obj=new Overload_6();
        obj.compare(58,67);
        obj.compare('T','H');
        obj.compare("Inheitance","Tirthankar");
    }
    
}
