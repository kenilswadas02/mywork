package day8;


public class task4 {
    public static void main(String[] args) {

        // star pattern !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        // for(int i=0;i<5;i++){
        //     for(int j=0; j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();   
        // }

        // left triangle star pattern !!!!!!!!!!!!!!!!!!!!!!!
        // for(int i=0;i<5;i++){
        //     for(int j=2*(5-i); j > 0 ;j--){
        //         System.out.print(" ");
        //     }
        //     for (int j=0; j<=i; j++ )   
        //     {   
        //     //prints star      
        //     System.out.print("* ");   
        //     }   
        //     System.out.println();   
        // }

        // // pyramid star program !!!!!!!!!!!!!!!!!!!!!!!!!!!
        // for(int i=0;i<5;i++){
        //         for(int j=(5-i); j > 1 ;j--){
        //             System.out.print(" ");
        //         }
        //         for (int j=0; j<=i; j++ )   
        //         {   
        //         //prints star      
        //         System.out.print("* ");   
        //         }   
        //         System.out.println();   
        //     }

        // downwords traingle star program!!!!!!!!!!!!!!!!!!!!
        //  for(int i=6-1;i>=0;i--){
               
        //         for (int j=0; j<=i; j++ )   
        //         {   
        //         //prints star      
        //         System.out.print("* ");   
        //         }   
        //         System.out.println();   
        //     }
        // star pattern without inner portion!!!!!!!!!!!
        int i,j,n=9;
        for( i=1;i<=n;i++){
            
                    // for ( j=i; j<n ;j++ )   
                    // {   
                    // System.out.print(" ");   
                    // }   
                    for ( j=1;j<=i;j++){
                        if(j==1||i==n||j==i){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    } 
                    System.out.println("");
                }
    }
}
