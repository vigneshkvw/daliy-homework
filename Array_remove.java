
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
Write a Java program to remove a specific element from an array.
 */
public class Array_remove {
public static void main(String[] args) {
Scanner A=new Scanner(System.in);
int a=A.nextInt();
   int[] my_array = new int[a];
   for(int i=0;i<my_array.length;i++){




   }
   System.out.println("Original Array : "+Arrays.toString(my_array));

   int removeIndex = A.nextInt();

   for(int i = removeIndex; i < my_array.length -1; i++){
        my_array[i] = my_array[i + 1];
      }
    System.out.println("After removing the second element: "+Arrays.toString(my_array));
 }
}
