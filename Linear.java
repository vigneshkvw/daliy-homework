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
 public class Linear {
    private static int temp;
    private static int pos;
    

    public static void main(String a[]){
Scanner arr =new  Scanner(System.in);
System.out.println("enter your number of array");
    int N=arr.nextInt();
    System.out.print("enter yore element in array");
    int[] arrary = new int[N];
    for (int i=0 ; i<N; i++){
        arrary[i]=arr.nextInt();
    }
    System.out.print("enter the element to be searched: ");
    int M=arr.nextInt();
    for(int i=0; i<N; i++){
        if(M== arrary[i]){
            temp=1;
            pos=i+1;

        }
    }
       if(temp == 1){
           System.out.println("your index number is : " +pos);
        }else{
            System.out.println("-1");
        }

    }
}