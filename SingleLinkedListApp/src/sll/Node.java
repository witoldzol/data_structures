/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sll;

/**
 *
 * @author esu
 */
public class Node {
    
    //variables
    private Node next;
    private Object ele;
    //constructor
    public Node(Object e, Node n){
        this.ele = e;
        next = n;
    }
    //setters
    public void setNext(Node n){
        next = n;
    }
    public void setEle(Object e){
        ele = e;
    }
    //getters
    public Node getNext(){
        return next;
    }
    public Object getEle(){
        return ele;
    }
    
}
