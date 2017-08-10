
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public class Stack_demo {

 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tc = scanner.nextInt();
		MyStackAL s = new MyStackAL();

		for(int i = 0; i<tc; i++){
			int op = scanner.nextInt();

			switch(op){
			case 1:
				int e = scanner.nextInt();
				s.push(e);
				break;
			case 2:
				s.pop();
				break;
			case 3:
				s.printMax();
				break;
			default:
				break;
			}
		}

		scanner.close();
	}

}

class MyStackAL extends Stack<Integer> {


	private int max = 0;


	public Integer push(Integer e){
		if(max<e){
			max = e;
		}
		super.push(e);
		return e;
	}


	public Integer pop(){
		Integer e = super.pop();
		if(e==max) findMax();
		return e;
	}


	private static final long serialVersionUID = 1L;

	public void printMax(){
		System.out.println(max);
	}

	public void findMax(){
		int max = 0;
		if(this.elementCount>0)
			max = (int)peek();
		for(int i = 0; i< this.elementCount; i++){
			if(max<(int)this.elementAt(i)){
				max = (int)this.elementAt(i);
			}
		}
		this.max = max;
	}
}