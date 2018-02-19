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
public class Node {
    
    //variables
    private Node prev, next;
    private Object element;
    
    //constructor
    public Node(Object e, Node prev, Node next){
        element = e;
        this.prev = prev;
        this.next = next;
    }
    
    //setters
    public void setNext(Node next){
        this.next = next;
    }
    
    public void setPrev(Node prev){
        this.prev = prev;
    }
    
    public void setElement(Object e){
        element = e;
    }
    
    //getters 
    public Object getElement(){
        return element;
    }
    

    
    
    
}
