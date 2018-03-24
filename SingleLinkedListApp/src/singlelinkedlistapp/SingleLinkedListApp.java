/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinkedlistapp;

public class SingleLinkedListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //declare object (using interface)
        LinearList NumList;
        //initialize it (using implementation)
        NumList = new SLList();
        
        //add elements to the list in order as given
        NumList.add(9);
        NumList.add(8);
        NumList.add(3);
        NumList.add(4);
        NumList.add(1);
        NumList.add(12);
        NumList.add(15);
        NumList.add(22);
        NumList.add(2);
        NumList.add(5);
        
        NumList.printOdd();
        
        NumList.printReverse();
        
        
        
    }


}
