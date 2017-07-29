
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;




public class HashSet {

   public static void main(String[] a) {
       	Scanner in = new Scanner(System.in);
       java.util.HashSet Set = new java.util.HashSet();
    HashList_1 obj = new HashList_1();

    obj.create();
	try {
		while (true) {
				int ch = in.nextInt();
				switch (ch) {

                      case 1:
                          obj.insert();
                          break;
                    case 2:
                        obj.sublist();
                             break;
                    case 3:
                        obj.deleteindex();
                        break;
                    case 4:
                         obj.deleteArray();
       break;
            	default:
					System.out.println("Invalid Option");
				}
			}
		} catch (Exception e) {
			System.out.println("SELF THROWN EXCEPTION IS--->" + e);
		} finally {
			in.close();
		}
    }
           
   



}