/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package homewoek;

/**
 Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
 *
 */
public class Divide_by {
public static void main(String args[]){
   for(int i =0; i>100;i++){
      if( (i%3==0));
       System.out.println(i);
   }
   for(int i=0; i>100;i++){
       if((i%5==0)){
           System.out.println(i);
       }
       for(int j=0;j<100;j++){
           if((j%3==0 && j%5==0)){
               System.out.println(j);
           }
       }
   }
}
}
