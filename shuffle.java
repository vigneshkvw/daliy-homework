
import sun.applet.Main;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */

 public class shuffle {
/*    private static int x =3;
public static void main(String args[]){
    while(x>0){
        if(x>2){
            System.out.print("a");
        }
        x=x-1;
        System.out.print("-");
        if(x==2){
            System.out.print("b c");
        }
    x=x-1;
        System.out.print("-");
        if(x==1){
            System.out.println("d");
        }
    }
}*/

  public static void main(String args[]){
    /*  int x=5;
      while(x>1){
          x=x-1;
          if(x<3){
              System.out.println("small x :"+x);
          }
      }*/


      int x=1;
      while(x<10){
          x=x+1;
          if(x>3){
              System.out.println("big :"+x);
          }else{
              System.out.println("small :"+x);
          }
      }
  }
}



