import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        int num1,num2,profit;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the profit percentage");
        num1=obj.nextInt();
        System.out.println("Enter the amount lost in Rs.");
        num2=obj.nextInt();
        profit=100000+(1000*num1);
        profit=profit-num2;
        num2=(100000-profit)/1000;
        if(num2==0){
            System.out.println("After two years he gets no loss or no gain");
            return;
        }else if(num2>0){
            System.out.println("After two years he gets a loss of "+num2+"%.");
            return;
        }else{
            System.out.println("After two years he gets a profit of "+(-1)*num2+"%.");
        }
        }
    }