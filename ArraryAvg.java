
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public class ArraryAvg {
    public static void main(String[] args) {

Scanner s =new  Scanner(System.in);
   System.out.print("enter arrary size :");
 int N=s.nextInt();
 int[] arr=new int[N];
 System.out.print("enter your elements in arrary :");
         for (int i = 0; i < N; i++) {
           arr[i] = s.nextInt();

        }

 int sum = 0;
       for(int i=0; i < arr.length ; i++)
        sum = sum + arr[i];
        double average = sum / arr.length;
        System.out.println("Average value of the array elements is : " + average);
        System.out.println("sum value of the array elements is : " + sum);

    }

}