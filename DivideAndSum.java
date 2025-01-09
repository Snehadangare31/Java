import java.util.*;
public class DivideAndSum
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=0; 
        try{
                System.out.println("Enter two number : ");
                a = sc.nextInt();
                b = sc.nextInt(); 
                int c=a/b;
                System.out.println("Division is :  "+c);  
        } 
        catch(ArithmeticException e){

              System.out.println("Denominator should not be zero");
                
        }                     
        catch(InputMismatchException ex){

              System.out.println("Please enter integers only");
              System.exit(0);
         }
        int d = a+b;
        System.out.println("Sum is "+d);
        
       
     }
}