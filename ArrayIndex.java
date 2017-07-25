
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public class ArrayIndex {


     public int  findIndex (int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
   public  void main(String[] args) {

    Scanner s = new Scanner(System.in);
        System.out.print("enter arrary size :");
        int N = s.nextInt();
        System.out.println("enter your elements :");

        int[] my_array = new int[N];
for(int i=0;i<N;i++)
{
    my_array[i] = s.nextInt();
}
    System.out.print("enter number to be search : ");
        int M = s.nextInt();
           System.out.println( "index of :"  + findIndex(my_array, M));

   
   
   }
}
