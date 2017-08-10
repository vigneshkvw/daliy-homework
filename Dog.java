/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package homewoek;

/**
 *
 * @author viki
 */
public class Dog {
   static  int weight = 0;
public static  void main(String args[]){
    Dog figo=new Dog();
figo.weight=10000;
bark();
}

    private static void bark() {
        
if(weight<50){
    System.out.println("hi");
}else{
            System.out.println("heloo");
}
    }
}
