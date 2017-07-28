
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public class leftRoatation_Arrary {

    public static void main (String [] args)
    {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter arrary size: ");
        int numIntegers = sc.nextInt();
         System.out.println("enter the element to be rotate :");

        int rotateNum = sc.nextInt();
     
        int index;
        int[] a = new int[numIntegers];
        int[] b = new int[numIntegers];

        for (int i = 0; i < numIntegers; i++)
            {
                System.out.println("enter the element  :");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < numIntegers; i++)
            {
            index = i - rotateNum;
            if (index < 0)
                {
                index = numIntegers + index;
            }
            b[index] = a[i];
        }
            System.out.println("ROTATED ARRARY :");
        for (int i = 0; i < numIntegers; i++)
            {
           System.out.print(+b[i] + " ");
        }
}
}
