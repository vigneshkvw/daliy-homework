/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hackers;

/**
 *
 * @author viki
 */
import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class stringNumber {

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for (int i = 0; i < testCase; i++) {
            String inputStr = in.next();
            System.out.println(separte(inputStr));
        }
       in.close();
    }
    public static String separte(String str)
    {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(i%2==0)
            {
                even.append(str.charAt(i));
            }
            else
            {
                odd.append(str.charAt(i));
            }
        }
        return even.toString()+" "+odd.toString();
    }
}