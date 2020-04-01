import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int low,high,c1=1;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first number");
        low=obj.nextInt();
        System.out.println("Enter the last number");
        high=obj.nextInt();
        for(int i=low;i<=high;i++){
            int d=i/2;
            int count=1;
            while(d>1){
                if(i%d==0){
                    count++;
                    break;
                }d--;
            }
            if(i==high){
            if(count!=2){
                if(i%10==1)
                    System.out.print(","+i);
                    return;
            }}
            else if(count!=2){
                if(i%10==1){
                    c1++;
                    if(c1==2){
                        System.out.print(i);
                        continue;
                    }
                    System.out.print(","+i);
                    }
                    
                }
            }
            for(int i=high;;i++){
                int d=i%10;
                if(d!=1)
                continue;
                else{
                    d=i/2;
                    int count=1;
                    while(d>1){
                        if(i%d==0){
                            count++;
                            break;}
                            d--;
                            
                        }
                        if(count!=2){
                            System.out.print(","+i);
                            return;
                    }
                }
            }
        }
    }
