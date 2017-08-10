/*
 * Write a Java program to reverse a word
 * and open the template in the editor.
 */

package homewoek;

import java.util.Scanner;

/**
 *
 * @author viki
 */
public class Reverse_word {
    private static char result;
public static void main(String args[]){
    Scanner in=new  Scanner(System.in);
    String word=in.nextLine();
    char [] chr=word.toCharArray();
    for(int i=chr.length-1;i>=0;i--){
        result =chr[i];
        System.out.print(result);
    }
}
}
