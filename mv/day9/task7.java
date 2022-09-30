package day9;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("enter the  number of times dice rolled(between 1 to 6) :");
        int n=sc.nextInt();
        System.out.println(n);
        System.out.println("enter the sum u want :");
        int sum=sc.nextInt();
        sc.close();
        int count=0;
        for(int i=1;i<=6;i++){  
            for(int  j=1;j<=6;j++){
                for(int k=1;k<=6;k++){
                    for(int x=1;x<=6;x++){
                        for(int y=1;y<=6;y++){
                            for(int z=1;z<=6;z++){
                                if(n==1){  
                                    if(i==sum){
                                     count++;
                                     i++;
                                    } 
                                 }
                                 else if(n==2){
                                     if(i+j == sum){
                                         count++;
                                     }
                                 }
                                else if(n==3){
                                    if(i+j+k == sum){
                                        count++;
                                    }
                                }
                                else if(n==4){
                                    if(i+j+k+x == sum){
                                        count++;
                                    }
                                }
                                else if(n==5){
                                    if(i+j+k+x+y== sum){
                                        count++;
                                    }
                                }
                                else if(n==6){
                                    if(i+j+k+x+y+z== sum){
                                        count++;
                                    }
                                }
                            }
                        }
                    }
                    
                }
                       
            }
        }
        System.out.println(count);

    }
}
