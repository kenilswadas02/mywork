package day9;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);  
        System.out.println("Enter the Value of n and r?");  
          int n = sc.nextInt();  
          int r = sc.nextInt(); 
          int  fact1=n;
          for (int i = n - 1; i >= 1; i--)  
            {  
                fact1 = fact1 * i;  
            } 
            // permutation  
            int number;  
            number = n - r;  
           int  fact2 = number;  
            for (int i = number - 1; i >= 1; i--)  
            {  
                fact2 = fact2 * i;  
            }  
            
            int p = fact1 / fact2;  

            // combination 
            int fact3=r;
            for (int i = fact3 - 1; i >= 1; i--)  
            {  
                fact3 = fact3 * i;  
            }  
            int c = fact1 / (fact2*fact3); 
            System.out.println("permutation  is :" +" "+ p);
            System.out.println("combination is : " + c);

          sc.close();
    }
}
