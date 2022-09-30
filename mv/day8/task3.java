package day8;
import java.util.Arrays;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            System.out.print("Enter the number of elements you want to store: ");  
            n = sc.nextInt();
            int[] array = new int[n];  
            System.out.println("Enter the elements of the array: ");
            for(int i=0; i<n; i++)  
            {  
            array[i]=sc.nextInt();  
            }  
            Arrays.sort(array);
            // System.out.println(array[n-1]);
            for(int i=0; i<n; i++)  
            {  
            
                System.out.println(array[i]);  
            } 
            System.out.println("Your second bigest element is :");  
            System.out.println(array[n-2]);  
        }

           
           
            
        }
}
