import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        String s;
        int num,pay=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter 'E' for Electric Kettle and 'I' for Induction Stove( No other character will be accepted)");
        s=obj.nextLine();
        System.out.println("Enter the number of units ordered");
        num=obj.nextInt();
        if(s.equals("E")){
        if(num>=1 && num<=10){
        pay=950;
        }else if(num>=11 && num<=20){
        pay=900;
        }else if(num>20){
        pay=850;
        }}
        else{
            if(num>=1 && num<=15){
                pay=1100;
            }else if(num>=16 && num<=25){
                    pay=1000;
            }else{
                pay=975;
            }}
        System.out.println("Total amount to be paid is Rs."+pay*num);
    
    }
}