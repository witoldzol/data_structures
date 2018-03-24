/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearchexample;

/**
 *
 * @author cmuntean
 */
public class LinearSearchExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // TODO code application logic here
        MyArrayList<Integer> mylist;
        mylist = new MyArrayList<Integer>();
        
        mylist.add(new Integer(15));
        mylist.add(new Integer(99));
        mylist.add(new Integer(6));
        mylist.add(new Integer(86));
        
        mylist.add(new Integer(58));
        mylist.add(new Integer(35));
        mylist.add(new Integer(87));
        mylist.add(new Integer(0));
        mylist.add(new Integer(4));
       
        System.out.println("The elements are: " +mylist.toString());
        
        
        System.out.println(" unordered list search result : " + mylist.unordered_sequentialSearch(15));
        System.out.println(" ORDERED list search result : " + mylist.ordered_sequentialSearch(99));
        
        // Write a code to pass the values to the methods for the unordered search
        
        // Declare a new arraylist named mylist2
        
        // Insert 9 new values into the mylist in a sorted form
        
        // Write a code to pass the values to the methods for the ordered search


    }


}