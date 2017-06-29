/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hackers;

//Task
//Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.

//Note: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result!

//Input Format

//There are  lines of numeric input:
//The first line has a double,  (the cost of the meal before tax and tip).
//The second line has an integer,  (the percentage of  being added as tip).
//The third line has an integer,  (the percentage of  being added as tax).

//Output Format

//Print The total meal cost is totalCost dollars., where  is the rounded integer result of the entire bill ( with added tax and tip).
import java.util.*;
public class Operators
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
 System.out.println("enter your cost of the meal before tax and tip ");
        double mealCost = scan.nextDouble(); 
System.out.println("enter your percentage of  being added as tip ");
         int tipPercent = scan.nextInt();
         System.out.println("enter your  percentage of  being added as tax ");
        int taxPercent = scan.nextInt(); 
        
         scan.close();

         double tip=mealCost*tipPercent/100;

         double tax=mealCost*taxPercent/100;

         int totalCost = (int) (mealCost+tip+tax);

         System.out.println("The total meal cost is "+totalCost+" $.");
       }

}