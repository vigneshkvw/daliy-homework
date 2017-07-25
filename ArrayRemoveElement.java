
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
public class ArrayRemoveElement {
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

           System.out.println("Original Array : "+Arrays.toString(my_array));
           int removeIndex = 1;
           for(int i = removeIndex; i < my_array.length -1; i++){
           my_array[i] = my_array[i+1];
      }
            System.out.println("After removing the second element: "+Arrays.toString(my_array));
}
}
