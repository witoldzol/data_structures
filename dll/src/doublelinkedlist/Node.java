/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlist;

/**
 *
 * @author x17143853
 */
public class Node {
    //variables
    private Object ele;
    private Node prev, next;
    
    //setters
    public void setPrev(Node n){
        prev = n;
    }
    public void setNext(Node n){
        next = n;
    }
    //getters
    public Object getEle(){
        return ele;
    }
    public Node getPrev(){
        return prev;
    }
    public Node getNext(){
        return next;
    }
    //constructor
    public Node(Object e, Node p, Node n){
        ele = e;
        prev = p;
        next = n;
    }
}
