import java.util.Scanner;
public class SnacksDetails{
    public static void main(String[] args){
        int pizza,puffs,cd;
        int bill;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no of pizzas bought:");
        pizza=obj.nextInt();
        System.out.println("Enter the no of puffs bought:");
        puffs=obj.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        cd=obj.nextInt();
        bill=((pizza*100)+(puffs*20)+(cd*10));
        System.out.println("Bill Details");
        System.out.println("No of pizzas:"+pizza);
        System.out.println("No of puffs:"+puffs);
        System.out.println("No of cooldrinks:"+cd);
        System.out.println("Total price="+bill);
        System.out.println("ENJOY THE SHOW!!!");
    }
}