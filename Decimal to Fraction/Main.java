import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        double num=0;
        Scanner obj=new Scanner(System.in);
        num=obj.nextDouble();
        int index=-1;
        String s=String.valueOf(num);
        int digit=s.length()-1-s.indexOf('.');
       // System.out.println(digit);
        int den=1;
        index=s.indexOf(".");
       // System.out.println(index);
        if(num%1==0){
            System.out.println("Input a decimal number");
            return;
        }
        for(int i=0;i<digit;i++){
            num=num*10;
            den=den*10;
        }
        int n=(int)Math.round(num);
       // System.out.println(n);
        int gd=getgcd(n,den);
        //System.out.println(gd);
        
        String frac=""+n/gd+"/"+den/gd;
        System.out.println("Fraction: "+frac);
    }
    public static int getgcd(int n,int den){
        if(den==0){
            return n;
        }
       // System.out.println(n);
       // System.out.println(den);
        return getgcd(den,n%den);
    }
}