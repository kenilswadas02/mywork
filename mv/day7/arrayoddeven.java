import java.util.Scanner;  
public class arrayoddeven {
    public static void  main(String[]ars) {
        System.out.println("Enter the total number of elements of the array: ");  
        int n;
        int count=0;  
        try (Scanner sc = new Scanner(System.in)) {
            n=sc.nextInt();
            int a[]= new int[10];
            System.out.println("Enter the  of the array: ");  
            for(int i=0; i<n; i++)  
            {  
                System.out.println("Enter the "+ " of the array: " );  
            //reading array elements from the user  
            a[i]=sc.nextInt();  
            }  

            for (int i=0; i<n; i++)   
            {  
            System.out.println(a[i]);  
            }  
            
            for(int i=0 ; i<n; i++){
                if((a[i]%2)==0){
                    
                    // System.out.println( a[i]);
                    System.out.println("even  elements are there !!");
                     count = count+1;
                }             
            }
        }  
        if( count == 0){
            System.out.println("only odd elements are there !!");
        }
        
    }
}
