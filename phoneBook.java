/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hackers;

/**
 *
 * @author viki
 */
import java.util.*;

public class phoneBook {
    private static Map<String, Integer> phonebook = new HashMap<String, Integer>();
    static Scanner in = new Scanner(System.in);

    public static void main(String [] args){
        readPhoneNumbers();
        lookUpNumbers();
        displayAllNumbers();
    }

    private static void readPhoneNumbers(){
        while(true){
            System.out.println("Enter a name: ");
            String name = in.nextLine();
            if(name.equals(""))break;
            System.out.println("Enter a phone number for " +name +":");
            Integer number = in.nextInt();
            phonebook.put(name, number);
        }
    }

    private static void lookUpNumbers(){
        while(true){
            System.out.println("Enter name to look up number: ");
            String name = in.nextLine();
            if(name.equals(""))break;
            Integer number = phonebook.get(name);
            if(number == null){
                System.out.println(name + " not in phonebook");
            }else{
                System.out.println(number);
            }
        }
    }

    private static void displayAllNumbers(){
        for(String name: phonebook.keySet()){
            Integer number = phonebook.get(name);
            System.out.println(name + ": " + number);
        }
    }

}