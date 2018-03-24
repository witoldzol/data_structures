/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortexample;
import java.util.*;

public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        MyArrayList<String> li;
        li = new MyArrayList<String>();

        //TAKS2: add at least 5 elements of String type in your collection

        li.add("Zbychu");
        li.add("Eva");
        li.add("Abrakebabra");
        li.add("OmgPleaseStop");
        li.add("______aaaa");
        li.add("zbychu");
        li.add("I really don't like Java");
        //TASK3: Print the elements from your collection

        for (String string : li) {
            System.out.println(string);
            System.out.println("------------------");
        }
        //TASK4: call the bubbleSort() method

        li.bubbleSort();
        
        //TASK5: Print again the elements. Now your colection should be sorted
        System.out.println("After sorting:\n");
        
        for(String str : li){
            
            System.out.println(str);
            System.out.println("------------------");
        }
        //TASK7: call the simplebubblesort() method and check if it works correct
        
        li.simplebubblesort();
        
        System.out.println("And now the simple sort: " );
        
        System.out.print(li.toString());

    }

}
