/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hackers;

/**
 *
 * @author viki
 */

import java.io.*;
import java.util.*;

public class ClassAndInstance {
    private int age;

	public ClassAndInstance(int initialAge) {
  		
        if (initialAge >= 0) {
            age = initialAge;
        } else {
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;
        }
	}

	public void amIOld() {
        String ans;
        if (age < 13) {
            ans = "You are young.";
        }
        else if (age < 18) {
            ans = "You are a teenager.";
        }
        else {
            ans = "You are old.";
        }
       
        System.out.println(ans);
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			ClassAndInstance p = new ClassAndInstance(age);
			p.amIOld();
			
			System.out.println();
        }
		sc.close();
    }
}
