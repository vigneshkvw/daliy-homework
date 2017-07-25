
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public class ArrayRigntRotation {

    public static void main (String [] args)
    {
         Scanner obj = new Scanner (System.in);
    
        int[] list = new int[10];
        for(int i = 0; i < 10; i ++)
        {
            System.out.println("Enter a number: ");
            int num = obj.nextInt();
        }
        for(int i = 0; i < 10; i ++)
       {

           list[0] = list[9];

            list[i] = i+1;

            System.out.println("NEW: " + list[i]);

        }

    }

}
