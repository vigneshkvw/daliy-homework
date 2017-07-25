
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public class ArraySum {
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter arrary size :");
        int N = s.nextInt();
        System.out.println("enter your elements :");

        int[] my_array = new int[N];

        for (int i = 0; i < N; i++) {
           my_array[i] = s.nextInt();

        }


int sum = 0;

for (int i : my_array)
    sum += i;
System.out.println("The sum is " + sum);
}

}
