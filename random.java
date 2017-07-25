/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
import java.util.Random;
public class random {
    private static int i;
public static  void main(String args[]){
    Random dice = new Random();
    int num;
    for(i=1; i<=10; i++){
       num = dice.nextInt(5);
    System.out.println(num);
    }
}
}
