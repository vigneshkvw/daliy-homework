
import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane.ScalableIconUIResource;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public class Find_Index_of_element {
public static void main(String args[]){
    int[] A={1,2,3,4,5,6,5};
    Scanner M=new Scanner(System.in);
    int N=M.nextInt();
    int index=Arrays.asList(A).indexOf(N);
    System.out.println(index);
}
}
