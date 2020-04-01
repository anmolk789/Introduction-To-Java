import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        float num;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the grade point:");
        num=obj.nextFloat();
        if(num==5){
            System.out.println("Grade: O");
            System.exit(0);
        }else if(num>=4.5 && num<5){
            System.out.println("Grade: A");
            return;
        }else if(num>=4 && num<4.5){
            System.out.println("Grade: B");
            return;
        }else if(num>=3 && num<4){
            System.out.println("Grade: C");
            return;
        }else if(num>=2 && num<3){
            System.out.println("Grade: D");
            return;
        }else if(num>=1 && num<2){
            System.out.println("Grade: E");
            return;
        }else{
            System.out.println("Grade: F");
            return;
        }
    }
}