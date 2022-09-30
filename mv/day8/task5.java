package day8;

public class task5 {
    public static void main(String[] args) {
        int i, j ,n=6;
        for( i=1;i<=n;i++){
            
                    for ( j=i; j<n ;j++ )   
                    {   
                    System.out.print(" ");   
                    }   
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
