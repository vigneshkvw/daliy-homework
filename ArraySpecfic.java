
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public class ArraySpecfic {
public static boolean contains(int[] arr, int item) {
      for (int n : arr) {
         if (item == n) {
            return true;
         }
      }
      return false;
   }
   public static void main(String[] args) {
               Scanner s = new Scanner(System.in);
        System.out.print("enter arrary size :");
        int N = s.nextInt();
        System.out.println("enter your elements :");

        int[] my_array = new int[N];

        for (int i = 0; i < N; i++) {
           my_array[i] = s.nextInt();

        }
         System.out.print("enter number to be search : ");
        int M = s.nextInt();

           System.out.println(contains(my_array, M));
     
   }
}
