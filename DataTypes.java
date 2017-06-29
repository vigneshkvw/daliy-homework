/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hackers;

import java.util.Scanner;


//Objective
//Today, we're discussing data types. Check out the Tutorial tab for learning materials and an instructional video!

//Task
//Complete the code in the editor below. The variables iii, ddd, and sss are already declared and initialized for you. You must declare 333 variables: one of type int, one of type double, and one of type String. Then you must read 333 lines of input from stdin and initialize your 333 variables. Finally, you must use the +++ operator to perform the following operations:

//Print the sum of iii plus your int variable on a new line.
//Print the sum of ddd plus your double variable to a scale of one decimal place on a new line.
//Concatenate sss with the string you read as input and print the result on a new line.
//Note: If you are using a language that doesn't support using +++ for string concatenation (e.g.: CC\text{C}), you can just print one variable immediately following the other on the same line. The string provided in your editor must be printed first, immediately followed by the string you read as input.

//Input Format

//The first line contains an integer, iii.
//The second line contains a double, ddd.
//The third line contains a string, sss.

//Output Format

//Print the sum of both integers on the first line, the sum of both doubles on the second line, and then the two concatenated strings on the third line.

//Sample Input

//12
//4.0
//is the best place to learn and practice coding!
//Sample Output

//16
//8.0
//HackerRank is the best place to learn and practice coding!/
public class DataTypes {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
		Scanner scan = new Scanner(System.in);       
	
          int i2;
		double d2;
		String s2;
         System.out.println("enter your second integer");
		i2 = scan.nextInt();
        System.out.println("enter your second double");
		d2 = scan.nextDouble();
         System.out.println("1.enter your second string");
		s2 = scan.nextLine();
		s2 = scan.nextLine();
       
		System.out.println(i + i2);
             
		System.out.println(d + d2);
             
		System.out.println(s + s2);

		scan.close();
	}

}