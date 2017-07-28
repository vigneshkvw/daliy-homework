/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
import java.util.Scanner;
import java.util.Stack;

class Max_stack {

 public static Stack<Integer> mainStack;
    public static Stack<Integer> minStack;
    public static Stack<Integer> maxStack;

    public static int findMax(Stack input) {
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        mainStack = new Stack<Integer>();
        maxStack = new Stack<Integer>();
        int T = in.nextInt();
        int solutions[] = new int[T];
        for (int i=0; i<T; i++) {
            int code = in.nextInt();
            solutions[i] = -1;
            if (code == 1) {
                int x = in.nextInt();
                mainStack.push(x);
                if (maxStack.empty() || x >= maxStack.peek()) { maxStack.push(x); }
            }
            else if (code == 2) {
                if (!mainStack.empty()) {
                    Integer value = mainStack.pop();
                    System.out.println("popped value: "+value);
                    if (maxStack.peek().equals(value)) {
                        maxStack.pop();
                        System.out.println("popped max: "+value);
                    }
                }
            }
            else if (code == 3) { solutions[i] = maxStack.peek(); }
        }
        for (int i=0; i<T; i++) {
            if (solutions[i] != -1) {
                System.out.println(solutions[i]);
            }
        }
    }
}