
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
public class ArraysSorting {
public static void main(String[] args){

   Scanner s = new Scanner(System.in);
        System.out.print("enter arrary size :");
        int N = s.nextInt();
        System.out.println("enter your elements :");

        int[] my_array1 = new int[N];

        for (int i = 0; i < N; i++) {
           my_array1[i] = s.nextInt();

        }

   String[] my_array2 = {                     /* how to get String value form user

                                                                        int M = s.nextInt();
                                                                          System.out.println("enter your elements :");

                                                                                   Static String[] my_array2 = new int[M];

                                                                                            for (String i = 0; i < M; i++) {
                                                                                                        my_array2[i] = s.nextInt();

                                                                                                                      }   ;        */
            "Java",
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++"
        };
    System.out.println("Original numeric array : "+Arrays.toString(my_array1));
    Arrays.sort(my_array1);
    System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));

    System.out.println("Original string array : "+Arrays.toString(my_array2));
    Arrays.sort(my_array2);
    System.out.println("Sorted string array : "+Arrays.toString(my_array2));
    }
}
