public class Date {
    public static void main(String args []){
    
        java.util.Calendar current = java.util.Calendar.getInstance(); 
        System.out.println("Current Year: "+current.get(java.util.Calendar.YEAR));
        int month = current.get(java.util.Calendar.MONTH);
        System.out.println("Current Month: "+(month+1));
    
    
    
    }
    
}
