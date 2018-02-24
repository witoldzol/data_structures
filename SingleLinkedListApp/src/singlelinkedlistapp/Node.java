/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinkedlistapp;

/**
 *
 * @author esu
 */
public class Node {
    
    //variables
    Node next;
    Object ele;
    //constructor
    public Node(Object ele, Node next){
        this.ele = ele;
        this.next = next;
    }
    
    //setters
    public void setEle(Object ele){
        this.ele = ele;
    }
    public void setNext(Node next){
        this.next = next;
    }
    
    //getters
    public Object getEle(){
        return ele;
    }
    public Node getNext(){
        return next;
    }
    
}
