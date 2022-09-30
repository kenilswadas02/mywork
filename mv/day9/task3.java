package day9;
import java.util.Scanner;
import java.util.regex.Pattern;
public class task3 {
    public static String reversewords(String str){
        // Specifying the pattern to be searched
        Pattern pattern = Pattern.compile("\\s");
 
        // splitting String str with a pattern
        // (i.e )splitting the string whenever their
        // is whitespace and store in temp array.
        String[] temp = pattern.split(str);
        String result = "";
 
        // Iterate over the temp array and store
        // the string in reverse order.
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
    }
 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  string as an input : ");
       String s1=sc.nextLine();
        System.out.println(reversewords(s1));
        sc.close();
    }
}   

