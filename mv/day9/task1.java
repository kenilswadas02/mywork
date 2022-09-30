package day9;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        // task1
        
            Scanner sc = new Scanner(System.in);
            System.out.println("enter n ");
            int n=sc.nextInt();
            sc.close();
            for(int i=1;i<=n;i++){
                    for(int j=(n-i); j >= 1 ;j--){
                        System.out.print("  ");
                    }
                    for (int j=0; j<(2*i-1); j++ )   
                    {   
                    //prints star 
                    
                    if(j%2==0){
                        System.out.print("* "); 
                    }
                    else {
                        System.out.print(i-1+" "); 
                    }
                    
                    }
    
                    System.out.println("");   
                }

                // downword pyramid 
                for (int i=n;i>=1;i--){
                    for( int j = i; j < n; j++)
                    {
                        System.out.print("  ");
                    }
                    if(i!=n){
                        for (int j=1;j<=2*i-1;j++){
                        
                            if(j%2!=0){
    
                                System.out.print("* "); 
                            }
                            else {
                                System.out.print(i-1+" "); 
                            }
                        }
                        System.out.println("");
                    }
                    
                    
                    
                }
        }
    }

