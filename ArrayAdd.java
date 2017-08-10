/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package homewoek;

/**
 *
 * @author viki
 */
public class ArrayAdd {
    private static int i;
    private static int sum=0;
public static void main(String args[]){

    int [] arr = new int[5];
      arr[0]=1;
      arr[1]=14;
      arr[2]=13;
      arr[3]=13;
      arr[4]=2;
      for(i=0;i<arr.length;i++){
       sum=sum+arr[i];
   
      
      }
   System.out.println(sum);
}
}
