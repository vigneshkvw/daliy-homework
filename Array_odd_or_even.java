
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
public class Array_odd_or_even {
public static void main(String[] args){
    Scanner A=new Scanner(System.in);
    int num=A.nextInt();
    int[] arr=new int [num];
    for(int i=0;i<arr.length;i++){
        arr[i]=A.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            System.out.println("even :"+i);
        }else{
       System.out.println("odd  :"+i);

        }
    }
}
}
