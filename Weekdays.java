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
public class Weekdays {
 public static void main(String[] args){
 Scanner day= new Scanner(System.in);
 System.out.println("enter your number");
 int days=day.nextInt();
 if(days==1)
     System.out.println("mondays");
 if(days==2)
     System.out.println("thuesday");
 if(days==3)
     System.out.println("weddays");
 if(days==4)
     System.out.println("thurdays");
 if(days==5)
     System.out.println("friday");
 if(days==6)
     System.out.println("satdays");
 if(days==7)
     System.out.println("sundays");


}
}
