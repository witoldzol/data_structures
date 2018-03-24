/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionSorting;
import java.util.*;
/**
 *
 * @author cmuntean
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyList<String> mylist;
        mylist = new MyList<String>();

        mylist.add("United States");
        mylist.add("Portugal");
        mylist.add("Russia");
        mylist.add("Argentina");
        mylist.add("Belgium");

        //*--------------------------------------------
        // Shuffle the collection  before sorting it
        //*--------------------------------------------
        Collections.shuffle(mylist);

        System.out.println("The elements after shuffle are: " +mylist.toString());

        mylist.insertSort();

        System.out.println("The elements after Insertion sort are: " +mylist.toString());
     
    }


}

