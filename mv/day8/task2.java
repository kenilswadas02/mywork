package day8;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {
   
    public static void main(String[] args) {
        System.out.println("enter character string");
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            char[] array=str.toCharArray();
            Arrays.sort(array);
            System.out.println(array);
            System.out.println(new String(array));
        }

    }
}
