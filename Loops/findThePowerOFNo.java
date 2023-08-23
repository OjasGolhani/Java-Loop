import java.util.*;
public class findThePowerOFNo{
public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        System.out.print("Enter any No. ");
        int Num = sc.nextInt();

        System.out.print("Enter the Power of Num ");
        int Power = sc.nextInt();

        int n = 1;

         for(int i=1; i<=Power; i++){
              n = n*Num;
              System.out.println("hello");
         }
         System.out.println(n);

        


    }
}