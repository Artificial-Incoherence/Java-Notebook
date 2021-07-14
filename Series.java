import java.lang.Math;
   
public class Series {

    long fact(int a){
    long ans=1;
    int temp=1;
    while(temp<=a){
        ans*=temp;
        temp++;
    }
    return ans;
    }
    void sumSeries_1(int b, int n){
        double ans=0d;
        for(int i=1;i<=n;i++){
        ans+=((double)b/fact(i));
    }
    System.out.println("Sum of series_1: "+ans);
    }
    void sumSeries_2(int b, int n){
        double ans=0.0;
        for(int i=1;i<=n;i++){
        ans+=((double)Math.pow(b,i)/fact(i+1));
    }
    System.out.println("Sum of series_2: "+ans);
    }
    void sumSeries_3(int b, int n){
        double ans=0.0;
        for(int i=1; i<=n; i++){
        ans+=(Math.pow(-1,i+1)*((double)Math.pow(b,i)/fact(i+1)));
    }
    System.out.println("Sum of series_3: "+ans);
    }


    public static void main(String args[]){
        Series scan=new Series();
        System.out.println(scan.fact(4));
        scan.sumSeries_1(5,7);
        scan.sumSeries_2(3,9);
        scan.sumSeries_3(2,6);
        
    }
        
        
    
}
