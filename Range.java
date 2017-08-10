
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public class Range {
public static void main(String [] args){
    Scanner A=new Scanner(System.in);
int num1=A.nextInt();
int num2=A.nextInt();
System.out.println(num1>=10&&num1<100||num2>=10&&num2<100);
System.out.println(System.getenv());
System.out.println(System.getProperties());
System.out.println(System.getenv("PATH"));
System.out.println(System.getenv("TEMP"));
System.out.println(System.getenv("USERNAME"));
long startTime = System.nanoTime();
long estimatedTime = System.nanoTime() - startTime;
System.out.println("Estimated time (in nanoseconds): "+estimatedTime);
 

}
}
