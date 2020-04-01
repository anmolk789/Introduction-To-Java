import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        int harry,james,leo,sara;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of boxes sold by Sara");
        sara=obj.nextInt();
        System.out.println("Enter the number of boxes sold by Harry");
        harry=obj.nextInt();
        System.out.println("Enter the number of boxes sold by Leo");
        leo=obj.nextInt();
        System.out.println("Enter the number of boxes sold by James");
        james=obj.nextInt();
        if(sara==harry && leo==james && harry==leo){
            System.out.println("All get the same gifts");
            System.exit(0);
        }
        if(sara>harry && sara>leo && sara>james){
            System.out.println("Sara receives the gifts.");
        }
        if(harry>sara && harry>leo && harry>james){
            System.out.println("Harry receives the gifts.");
        }
        if(leo>sara && leo>harry && leo>james){
            System.out.println("Leo receives the gifts.");
        }
        if(james>sara && james>leo && james>harry){
            System.out.println("James receives the gifts.");
        }
        if(sara==harry && sara>leo && sara>james){
            System.out.println("Sara and Harry receive the gifts.");
        }
        if(leo==james && leo>sara && leo>harry){
            System.out.println("Leo and James receive the gifts.");
        }
        if(leo==harry && leo>sara && leo>james){
            System.out.println("Harry and Leo receive the gifts.");
        }
        if(harry==james && james>sara && james>leo){
            System.out.println("Harry and James receive the gifts.");
        }
        if(sara== leo && sara>harry && sara>james){
            System.out.println("Sara and Leo receive the gifts.");
        }
        if(sara==james && sara>leo && sara>harry){
            System.out.println("Sara and James receive the gifts.");
        }
        if(sara==harry && harry==leo && leo==sara && sara>james){
            System.out.println("Sara, Harry and Leo receive the gifts.");
        }
        if(sara==leo && leo==james && james==sara && sara>harry){
            System.out.println("Sara, Leo and James receive the gifts.");
        }
        if(sara==harry && harry==james && james==sara && sara>leo){
            System.out.println("Sara, Harry and James receive the gifts.");
        }
        if(harry==leo && leo==james && james==harry && harry>sara){
            System.out.println("Harry, Leo and James receive the gifts.");
        }
    }
}