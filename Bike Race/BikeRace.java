import java.util.Scanner;
public class BikeRace{
    public static void main (String[] args) {
        int num;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the distance travelled");
        num=obj.nextInt();
        if(num<0){
            System.out.println("Invalid Input");
            return;
        }
        if(num==0){
            System.out.println("Your bonus points is 0");
            return;
        }
        int count=1;
        int prod1=1;
        int prod2=1;
        int temp=0;
        while(num!=0){
            temp=num%10;
            count++;
            if(count%2==0){
                prod1=prod1*temp;
            }else{
                prod2=prod2*temp;
            }
            num=num/10;
        }
        if(prod1>prod2){
            System.out.println("Your bonus points is "+prod1);
        }else if(prod2>prod1){
            System.out.println("Your bonus points is "+prod2);
        }else if(prod1==prod2){
            System.out.println("Your bonus points is "+(2*prod1));
        }
    }
}