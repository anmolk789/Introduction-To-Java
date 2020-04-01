import java.util.Scanner;
public class Placement{
    public static void main(String[] args){
        int cse,ece,mech;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        cse=obj.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        ece=obj.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        mech=obj.nextInt();
        if(cse<0 || ece<0 || mech<0){
            System.out.println("Input is Invalid");
            System.exit(0);
        }
        if(cse==ece && ece==mech && mech==cse){
            System.out.println("None of the department has got the highest placement");
            System.exit(0);
        }
        System.out.println("Highest placement");
        if(cse>=ece && cse>=mech){
            System.out.println("CSE");
        }
        if(ece>=cse && ece>=mech){
            System.out.println("ECE");
        }
        if(mech>=cse && mech>=ece )
            System.out.println("MECH");
        }
    }
