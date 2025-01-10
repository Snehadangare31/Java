import java.util.*;
class Pattern
{
    public static void main(String[]args) 
    {
         /*Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         int row=1;
         
         while(row<=n)
         {
             int col=1;
             while(col<=n)
             {
                 System.out.print("*"+" ");
                 col++;
             }
             System.out.println();
             row++;
         }
         *********************************************************************************************************************************

         Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         int row=1;

        while(row<=n)
         {
             int col=1;
             while(col<=row)
             {
                 System.out.print("*"+" ");
                 col++;
             }
             System.out.println();
             row++;
         }
*/
         Scanner sc = new Scanner(System.in);
         int i,j;
         int n = sc.nextInt();
         for(i=1;i<n;i++)
         {
             for(j=0;j<i;j++)
             {
                 System.out.print("*"+" ");
                 j++;
             }
              System.out.println();
             i++;
         }






    }   
}