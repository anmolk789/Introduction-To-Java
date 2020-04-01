import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        int num1,num2;
        Scanner obj=new Scanner(System.in);
        num1=obj.nextInt();
        if(num1<=0){
            System.out.println("Invalid Input");
            System.exit(0);
        }else{
            num2=obj.nextInt();
            if(num2<=0){
                System.out.println("Invalid Input");
                System.exit(0);
            }else{
                int sum=num1+num2;
                int prod=num1*num2;
                int rem;
                int n=0;
                while(prod!=0){
                    rem=prod%10;
                    n=n*10+rem;
                    prod=prod/10;
                }
                if(n==sum){
                    System.out.println("You are Lucky! Here Is your Gift.");
                }else{
                    System.out.println("Better Luck Next Time");
                }
            }
        }
    }
}