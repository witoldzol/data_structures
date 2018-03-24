/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dll;

/**
 *
 * @author x17143853
 */
public class DLL {
    
    //variables
    private int size;
    private Node head, tail, prev, curr, next;
    
    //constructor
    DLL(){
        head = null;
        tail = null;
        prev = null;
        curr = null;
        next = null;
        size = 0;
    }
    
    public void add(int index, Node ele){
        //if first element
        //no idea why but we need to set up curr & next as well
        if( size == 0){
            
            Node newNode = new Node( ele , null, null);
            head = newNode;
            curr = head;
            next = head;
            prev = null;
            
        } else {
            
            if( index == 1){
                
            }
        }
    }
}
