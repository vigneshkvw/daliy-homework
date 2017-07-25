/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hackers;

/**
 *
 * @author viki
 */
import java.util.Scanner;
public class ArrayReverse{
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
   System.out.println("Enter the size of the array");
         int n = input.nextInt();
         int[] arr = new int[n];
        System.out.println("Enter array values");
         for(int i=0; i<n; i++){
             arr[i]=input.nextInt();
         }
    System.out.println("YOUR reversed array");
         for(int i=(arr.length-1); i>=0; --i){

             System.out.print(arr[i]+ " ");
         }


     }
}