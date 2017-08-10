/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package homewoek;

import java.nio.charset.Charset;

/**
 *
 * @author viki
 */
public class CharSet {
public static void main(String[] args) {
	System.out.println("List of available character sets: ");
    for (String str : Charset.availableCharsets().keySet()) {
      System.out.println(str);
    }
  }
}
