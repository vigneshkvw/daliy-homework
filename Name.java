/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package allgorithum;

import java.util.Scanner;

/**
 *
 * @author viki
 */
public class Name {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
System.out.print("enter your 1st number");
int a=in.nextInt();

System.out.print("enter your 1st number");
int b=in.nextInt();
   for (int i=0;i<40;i++){
       System.out.println(a+"*"+(i+1)+"="+(a*(i+1)));
   }
    }
}
