
import java.util.Scanner;
import java.util.Stack;

public class StackSa {
public static void main(String args[]) {
Scanner scan = new Scanner(System.in);

		StackSa demo = new StackSa();

        try {
		while (true) {
		System.out.println("1.push\t2.max\t3add\t4display\t5exit.");

            int ch = scan.nextInt();
				switch (ch) {

                      case 1:
                          demo.push();
                          break;
                    case 2:
                       demo.max();
                             break;
                    case 3:
                        	demo.AddIndex();
                        break;
                    case 4:
                        demo.display();
       break;
                    
            	default:
					System.out.println("Invalid Option");
				}
			}
		} catch (Exception e) {
			System.out.println("SELF THROWN EXCEPTION IS--->" + e);
		} finally {
			scan.close();
		}

}

	Scanner scan;
	Stack element;

	int n;

	void push() {

		Scanner scan = new Scanner(System.in);
		element = new Stack();

		System.out.println("Stack - Insertion using Index");

		System.out.println("Enter 'n' value :");
		n = scan.nextInt();

		System.out.println("Enter the data - PUSH");

		for(int i=0; i<n; i++) {

			element.push(scan.next());
		}
	}

	void display() {

		System.out.println("\nThe Stack");

		for(int i=0; i<element.size(); i++) {

			System.out.println(element.get(i));
		}
	}

	void AddIndex() {

		System.out.println("\nInsertion using Index");

		System.out.println("Enter the index :");
		int index = scan.nextInt();

		System.out.println("Enter the Element :");
		String element = scan.next();

		this.element.add(index - 1, element);

		display();
	}

    private void max() {
         element.peek();
    }
}



	