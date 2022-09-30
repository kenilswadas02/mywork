package day9;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
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
    }
}
