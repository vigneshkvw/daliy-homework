
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public class ArraysCommonElements {
 public  static void main(String[] args) {

    Scanner s = new Scanner(System.in);
        System.out.print("enter first arrary size :");
        int N = s.nextInt();
        System.out.println("enter your elements :");

        int[] my_array = new int[N];
for(int i=0;i<N;i++)
{
    my_array[i] = s.nextInt();
}
        System.out.print("enter second array arrary size :");
        int M = s.nextInt();
        System.out.println("enter second your elements :");

        int[] my_array1 = new int[M];
for(int i=0;i<M;i++)
{
    my_array1[i] = s.nextInt();
}
        System.out.println("Array1 : "+Arrays.toString(my_array));
       System.out.println("Array2 : "+Arrays.toString(my_array1));

       HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < my_array.length; i++)
        {
            for (int j = 0; j < my_array1.length; j++)
            {
                if(my_array[i].equals(my_array1[j]))
                {
                    set.add(my_array[i]);
                }
            }
        }

        System.out.println("Common element : "+(set));
 }
}
