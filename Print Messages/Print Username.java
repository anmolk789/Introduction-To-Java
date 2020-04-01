import java.util.Scanner;
public class Username{
    public static void main(String[] args){
        String s;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the name:");
        s=obj.nextLine();
        System.out.println("Welcome " +s);
    }
}