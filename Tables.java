/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package homewoek;

import java.util.Scanner;

/**
 *
 * @author viki
 */
public class Tables {
    private static int i;
public static void main(String args[]){
    Scanner Ta=new Scanner(System.in);
    System.out.println("enter your number a:");

    int a= Ta.nextInt();
  for (int i=0; i< 10; i++){
   System.out.println(a + " x " + (i+1) + " = " +
     (a * (i+1)));
    }

}
}
