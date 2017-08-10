
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
public class Arrays_search {
public static void main(String[] args){
   Scanner B=new Scanner(System.in);
int a=B.nextInt();
   int[] num=new int[a];
    for(int i=0;i<num.length;i++){
        num[i]=B.nextInt();
    }
  System.out.print(Arrays.toString(num));
  System.out.println("enter the index to be searched: ");
int c=B.nextInt();
System.out.println(num[c]);

}
}
