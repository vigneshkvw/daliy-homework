
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
public class ArrayInsert {
    private static int pos;
    private static int val;
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

      
    System.out.print("enter your index position");
   int pos=s.nextInt();
    System.out.print("enter arrary to be insert :");
   int val=s.nextInt();
   int Index_position = pos;
   int newValue    = val;
  System.out.println("Original Array : "+Arrays.toString(my_array));

  for(int i=my_array.length-1; i > Index_position; i--){
    my_array[i] = my_array[i-1];
   }
   my_array[Index_position] = newValue;
   System.out.println("New Array: "+Arrays.toString(my_array));
   }
}
