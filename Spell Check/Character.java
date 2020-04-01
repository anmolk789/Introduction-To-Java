import java.util.Scanner;
public class Character{
    public static void main(String[] args){
        char a,b,c,d,e,f,g;
        String k;
        String p=new String("RAINBOW");
        String l=new String("rainbow");
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the first letter:");
        a=obj.next().charAt(0);
        System.out.println("Enter the second letter:");
        b=obj.next().charAt(0);
        System.out.println("Enter the third letter:");
        c=obj.next().charAt(0);
        System.out.println("Enter the fourth letter:");
        d=obj.next().charAt(0);
        System.out.println("Enter the fifth letter:");
        e=obj.next().charAt(0);
        System.out.println("Enter the sixth letter:");
        f=obj.next().charAt(0);
        System.out.println("Enter the seventh letter:");
        g=obj.next().charAt(0);
        StringBuilder sb=new StringBuilder();
        sb.append(a);
        sb.append(b);
        sb.append(c);
        sb.append(d);
        sb.append(e);
        sb.append(f);
        sb.append(g);
        k=sb.toString();
        if(k.equals(p)||k.equals(l)){
            System.out.println(k);
        }
        else
        System.out.println("The spelling is wrong");
    }
    
}