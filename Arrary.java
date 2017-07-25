


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */



import java.util.Arrays;
import java.util.Scanner;

public class Arrary
{
    private static int n;
   public static void main(String args[])
   {
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)

            arr[i] = in.nextInt();
          System.out.print("hi");
        int q = in.nextInt();
        Arrays.sort(arr);
        while(q-- > 0)
        {
            int power = in.nextInt();
            int sum = 0, i;
            for(i=0;i<n && arr[i] <= power; i++)
            {
                sum += arr[i];
            }
            System.out.println(i + " " + sum);
   }
}
}