package day10;

public class pattern_circle {
    public static void main(String[] args) {
        for(int i=0;i<=4;i++){
            for(int j=0;j<=4;j++){
                if(i==0&&(j==1||j==2)){
                    System.out.print("* ");
                }
                else if(i==0&&(j!=1||j!=2)) {
                    System.out.print(" ");
                }
                if((i==1||i==2)&&(j==0||j==3)){
                    System.out.print("* ");
                }else if((i==1||i==2)&&(j==1||j==2)){
                    System.out.print(" ");
                }
                if(i==3&&(j==1||j==2)){
                    System.out.print("* ");
                }
                else if(i==3&&(j!=1||j!=2)) {
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
        }
    }
}
