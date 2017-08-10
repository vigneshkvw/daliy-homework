/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package homewoek;

import java.util.Scanner;

/**
Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
 */
public class Two_interger {
public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int b=in.nextInt();
    int c=in.nextInt();
    int d=a+b;
    if(c==d){
        System.out.println(true);
    }else{
        System.out.println(false);
    }
}
}
