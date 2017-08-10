/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package homewoek;

import java.util.Scanner;

/*Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd.
 */
public class Even_number {
public static void main(String args[]){
    Scanner in =new Scanner(System.in);
    int x=in.nextInt();
    if(x%2==0){
        System.out.println(1);

    }else{
        System.out.println(0);
    }
}

}
