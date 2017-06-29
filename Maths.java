/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hackers;

import java.util.Scanner;

/**
 *
 * @author viki
 */
public class Maths {



    public static void main(String[] args) {
         System.out.println("ENTER YOUR NUMBER");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int x=1;x<11;x++)

    {

            System.out.println(""+n +" x " +x +" = " +(n*x));
        }}}
