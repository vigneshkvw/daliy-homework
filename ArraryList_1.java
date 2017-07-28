
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
class ArraryList_1 {

	ArrayList<Integer> list;
	Scanner scan;

	int n;
    private List<Integer> sublist;

    void deleteArray() {
        list.clear();
        System.out.println("arrarys are deleted");

    }

    void deleteindex() {
        System.out.println("enter the index to be deleted:");
        int i=scan.nextInt();
        list.remove(i);
        display();

    }

	void getVal() {

		list =  new ArrayList<Integer>();
		scan = new Scanner(System.in);


		System.out.println("\nEnter the size of arrary value :");
		n = Integer.parseInt(scan.nextLine());

		System.out.println("Enter the data :");

		for(int i=0; i<n; i++) {

			list.add(scan.nextInt());
		}
	}

	void display() {

		System.out.println("\nThe ArrayList");

		if(list.isEmpty()) {

			System.out.println("ArrayList is Empty..");
		}
		else {

			for(int i=0; i<list.size(); i++) {

				System.out.println(list.get(i));
			}
		}
	}

    void insert() {
                System.out.println("enter the index");
        int i=scan.nextInt();
        System.out.println("enter the data");
        int item=scan.nextInt();
        list.add(i-1,item);

    }

    void sublist() {
                System.out.println("from index:");
        int from=scan.nextInt();
        System.out.println("end index:");
        int end=scan.nextInt();
        sublist = list.subList(from-1, end);
		display();
        System.out.println("\nThe SubList");
for(int i=0; i<sublist.size(); i++) {

			System.out.println(sublist.get(i));
}

    }
}

