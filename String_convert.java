/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package homewoek;

import java.util.Scanner;

/**
 *
Write a Java program to convert a string to an integer in Java.
 */
public class String_convert {
public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String str1 = in.nextLine();
		int result = Integer.parseInt(str1);
        System.out.printf("The integer value is: %d",result);
		System.out.printf("\n");
    }
}
