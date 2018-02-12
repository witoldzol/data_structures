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
        
        SLList list = new SLList();
        
        String obj = "omg it works";        
        System.out.println( list.size() );
        
        list.add(1 , obj );
        
        list.add(2, obj + "lol");
        list.add("whatever");
        list.remove(1);
        list.printList();
        
        
        System.out.println( list.size() );
        
        System.out.println( list.get(1) );
        
        System.out.println( list.isEmpty() );
        
        
        
        
        
    }
}
