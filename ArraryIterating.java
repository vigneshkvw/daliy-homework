
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public class ArraryIterating {
/* Copy an array by iterating the array*/
     public  static void main(String[] args) {

    Scanner s = new Scanner(System.in);
        System.out.print("enter arrary size :");
        int N = s.nextInt();
        System.out.println("enter your elements :");

        int[] my_array = new int[N];
for(int i=0;i<N;i++)
{
    my_array[i] = s.nextInt();
}


         System.out.println("Source Array : "+Arrays.toString(my_array));

   for(int i=0; i < my_array.length; i++) {
    my_array[i] = my_array[i];
}
   System.out.println("New Array: "+Arrays.toString(my_array));
     }

}
