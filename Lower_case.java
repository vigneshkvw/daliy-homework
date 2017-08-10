
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public class Lower_case {
public static void main(String args[]){
    Scanner in = new Scanner(System.in);
     System.out.print("Input a String: ");
	 String line = in.nextLine();
     line=line.toLowerCase();
     System.out.println(line);

}
}
