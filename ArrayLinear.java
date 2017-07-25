/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package allgorithum;

import java.util.Scanner;

/**
 *
 * @author viki
 */
public class ArrayLinear {
 

public static void main(String args[] ) throws Exception {

 int flag = 0;
        int pos = 0;

        Scanner s = new Scanner(System.in);
        System.out.print("enter arrary size :");
        int N = s.nextInt();
        System.out.println("enter your elements :");
       
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
           arr[i] = s.nextInt();

        }
         System.out.print("enter number to be search : ");
        int M = s.nextInt();
        for(int i = 0; i < N; i++){
            if(M == arr[i]){
               flag = 1;
               pos = i + 1;
           }
        }

        if(flag == 1){
           System.out.println("your index number is : " +pos);
        }else{
            System.out.println("-1");
        }


    }
}