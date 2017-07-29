
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
class HashList_1 {
    private int n;

    void create() {
	 java.util.HashSet Set = new java.util.HashSet();
    Scanner scan = new Scanner(System.in);


		System.out.println("\nEnter the size of arrary value :");
		n = Integer.parseInt(scan.nextLine());

		System.out.println("Enter the data :");

		for(int i=0; i<n; i++) {

		Set.add(scan.nextInt());
		}
		System.out.println("\nThe ArrayList");

		if(Set.isEmpty()) {

			System.out.println("ArrayList is Empty..");
		}
		else {

			for(int i=0; i<Set.size(); i++) {

				System.out.print(Set.iterator());
			}
		}

    }

}
