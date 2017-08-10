
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public class Word_Spilt {
public static void main(String[] args){
    Scanner ne =new Scanner(System.in);
    System.out.println("enter your sentence");
    String line=ne.nextLine();
    String[] word=line.split(line, 2);
    System.out.print(word.length-2);
}
}
