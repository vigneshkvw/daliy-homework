/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hackers;

/**
 *
 * @author viki
 */
import java.util.*;

public class Conditional {
    private static String weird = "Weird";
    private static String notWeird = "Not Weird";
    public static void main(String[] args) {
       System.out.println("enter your  Interger to check it conditional ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";


        if(n%2==1){
            ans = weird;
        }

        else if(n >= 2){
            if(n > 20){
                ans = notWeird;
            }
            else if(n >= 6){
                ans = weird;
            }
            else if(n >= 2){
                ans = notWeird;
            }
        }
        System.out.println(ans);
    }
}
