package home_work_week_6;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme_9_ConvertUpperToLowerCase {

    public static void main(String[] args) {

        //scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the uppercase string : ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLowerCase t = new Programme_9_ConvertUpperToLowerCase();
        t.convertUppercaseToLowerCase(uppercase);
        //closing the scanner object
         scanner.close();
    }
     // conversion of uppercase to lower case method
    public void convertUppercaseToLowerCase(String text){
        System.out.println("The Lowercase value is = " + text.toLowerCase());

    }
}
