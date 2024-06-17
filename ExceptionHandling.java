import java.util.*;

public class ExceptionHandling {
    // this program helps the user to enter numbers without shutting down due to errors
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=1;

        do{

          try{
             System.out.println("Enter first num: ");
             int n1 = input.nextInt();
             System.out.println("Enter second num:");
             int n2 = input.nextInt();
             int sum = n1 / n2;
             System.out.println(sum);
             x = 2;
         }
         catch(Exception e){
            System.out.println("You cant do that, try another number");
         } 
         }while(x==1);
}
}