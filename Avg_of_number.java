/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package homewoek;

import java.util.Scanner;

/**
  Write a Java program that takes three numbers as input to calculate and print the average of the numbers
 */
public class Avg_of_number {
public static void main(String args[]){
    int sum,a,b,c,avg=0;
    Scanner in =new Scanner(System.in);
     a =in.nextInt();
    b=in.nextInt();
    c=in.nextInt();
    sum=a+b+c;
    avg=sum/3;
    System.out.println(avg);;
}
}
