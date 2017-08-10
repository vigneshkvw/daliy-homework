
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public class Weeks {
public static void main(String[] args){
    Scanner A=new Scanner(System.in);
    int num=A.nextInt();
    switch(num)
    {
        case 1:
           System.out
                   .print("monday");
           break;
        case 2:
            System.out.print("tuesday");
      break;
        case 3:
                        System.out.print("wed");
        break;
        case 4:
                        System.out.print("thur");
break;
        case 5:
            System.out.print("fri");
            break;
        case 6:
            System.out.print("sat");
            break;
        case 7:
            System.out.print("sun");
            break;
            default:
                					System.out.println("Invalid Option");

    }
}
}
