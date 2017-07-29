
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public class StackEquals {
  public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner reader=new Scanner(System.in);
        int[] a=new int[reader.nextInt()];
         int[] b=new int[reader.nextInt()];
         int[] c=new int[reader.nextInt()];
        int asum=0;
        int bsum=0;
        int csum=0;
        int acount=0;
        int bcount=0;
        int ccount=0;
        for(int i=0;i<a.length;i++)
            {
            a[i]=reader.nextInt();
            asum+=a[i];
        }
        for(int i=0;i<b.length;i++)
        {
            b[i]=reader.nextInt();
            bsum+=b[i];
        }
        for(int i=0;i<c.length;i++)
        {
            c[i]=reader.nextInt();
            csum+=c[i];
        }
        while(asum!=bsum||bsum!=csum)
            {
            if(asum>bsum||asum>csum)
                {
                asum-=a[acount];
                acount++;
            }
            if(bsum>asum||bsum>csum)
                {
                bsum-=b[bcount];
                bcount++;
            }
            if(csum>asum||csum>bsum)
                {
                csum-=c[ccount];
                ccount++;
            }


        }
        System.out.print(asum);

    }
}