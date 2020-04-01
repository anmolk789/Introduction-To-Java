import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        int num,count=0;
        int counteven=0,countodd=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number");
        num=obj.nextInt();
        int temp=num;
        int rem;
        while(num!=0){
            rem=num%10;
            count++;
            num=num/10;
        }
        int intArray[];
        intArray=new int[count+1];
        int sum=0;
        int we=count-1;
        while(temp!=0){
            rem=temp%10;
            sum=sum+rem;
            intArray[we]=rem;
            we--;
            if(rem%2==0){
                counteven++;
            }else{
                countodd++;
            }
            temp=temp/10;
        }
        int p=sum;
        int rem1=0;
            int numo=0;
        
        if(sum<10){
            numo=sum;
        }
        while(sum!=0){
            numo=numo+sum%10;
            sum=sum/10;
            if(sum==0 && numo>=10){
                sum=numo;
                numo=0;
            }
        }
        
        
        System.out.print("The Numbers are :");
        for(int i=0;i<count;i++){
            System.out.print(" "+intArray[i]);}
         System.out.println("");
        System.out.println("Sum of digits : " +p);
        System.out.println("Numerology number: " +numo);
        System.out.println("Number of odd numbers: " +countodd);
        System.out.println("Number of even numbers: " +counteven);
    }
}