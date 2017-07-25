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
public class LargerNumber {
  public static void main(String[] args){
      Scanner num =new Scanner(System.in);
      System.out.println("enter your 1st number");
      int Num1=num.nextInt();
      System.out.println("enter your 2st number");
      int Num2=num.nextInt();
      System.out.println("enter your 3st number");
      int Num3=num.nextInt();
      if(Num1>Num2)
          if(Num1>Num3)
              System.out.print("this number is greater:"+Num1);
      if(Num2>Num1)
          if(Num2>Num3)
              System.out.print("this number is greater:"+Num2);
      if(Num3>Num1)
          if(Num3>Num2)
              System.out.print("this number is greater:"+Num3);
  }
}
