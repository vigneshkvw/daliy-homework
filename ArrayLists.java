/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
import java.util.ArrayList;
public class ArrayLists {
     public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();


        list.ensureCapacity(20);

        list.add("1");

        list.add("TWO");

        list.add("THREE");

        list.add("FOUR");


        list.trimToSize();
        System.out.print(list);
    }
}
