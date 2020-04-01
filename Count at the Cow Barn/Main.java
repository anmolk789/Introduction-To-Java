import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        int m,n,cow,men;
        Scanner obj=new Scanner(System.in);
        m=obj.nextInt();
        n=obj.nextInt();
        int d=n-2*m;
        cow=d/2;
        if(cow<0){
            System.out.println("Invalid Input");
            return;
        }
        men=m-cow;
        if(men<0){
            System.out.println("Invalid input");
            return;
        }
        int c=men+cow;
        if(c==m){
            System.out.println("Number of Cows: "+cow);
            System.out.println("number of Men: "+men);
        }
    }
}