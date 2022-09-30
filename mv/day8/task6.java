package day8;

public class task6 {
   // function to print swastika
   static void swastika(int n)
   {
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++)
           {
               // checking if i < n/2
               if (i < n / 2)
               {
                    
                   // checking if j<n/2
                   if (j < n / 2)
                   {
                        
                       // print '*' if j=0
                       if (j == 0)
                           System.out.print("*");
                            
                       // else print space
                       else
                           System.out.print(" "+ " ");
                   }
                    
                   // check if j=n/2
                   else if (j == n / 2)
                   System.out.print(" *");
                    
                   else
                   {
                       // if i=0 then first n
                       // will have '*'
                       if (i == 0)
                           System.out.print(" *");
                   }
               }
               else if (i == n / 2)
                   System.out.print("* ");
               else
               {
                    
                   // middle numn and last numn
                   // will have '*' after i > n/2
                   if (j == n / 2 || j == n - 1)
                   System.out.print("* ");
                    
                   // last n
                   else if (i == n - 1)
                   {
                        
                       // last n will be have '*' if
                       // j <= n/2 or if it is last numn
                       if (j <= n / 2 || j == n - 1)
                           System.out.print("* ");
                       else
                           System.out.print(" "+ " ");
                   }
                   else
                   System.out.print(" "+" ");
               }
           }
           System.out.print("\n");
       }
   }
    
   // Driver code
   public static void main (String[] args)
   {
       // odd number of n and numn
       // to get perfect swastika
       int n= 10;
        
       // function calling
       swastika(n);
   }
}
    

