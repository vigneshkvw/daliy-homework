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
public class Age {
public static void main(String[] args){
    checkEligibility();

}

    private static void checkEligibility() {
        int a;
        Scanner age=new Scanner(System.in);
        a =age.nextInt();
        if(a%2==0)
            System.out.println("You are eligible to vote.");
        else
            System.out.println("You are  not eligible to vote.");

    }

}
