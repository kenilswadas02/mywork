package day8;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("enter string");
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            char[] strarray=str.toCharArray();
            StringBuffer stringBuffer= new StringBuffer();
            for(int i=0; i <strarray.length;i++){
                if(((strarray[i]) != ' ') && (strarray[i] != '\t')){
                    stringBuffer.append(strarray[i]);
   
                }
            }
            String noSpacestr = stringBuffer.toString();  
            System.out.println(noSpacestr);
        }  
    }    
    }
    
    
