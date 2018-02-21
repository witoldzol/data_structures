/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinkedlistapp;

import java.util.HashSet;
import java.util.Set;


public class sll implements sll_interface {
    
    //variables
    private Node curr, prev, head;
    private int size;

    //constructor
    sll(){
        curr=null;
        prev=null;
        head=null;
        size=0;
    }
    
    //private method
    private void setCurrent(int index){
        curr = head;
        //dont start from 0 !!
        for(int i =1; i<index; i++){
            prev = curr;
            curr = curr.getNext();
        }
        
    }
    
    @Override
    public Node get(int index){
        setCurrent(index);
        return curr;
    }
    
    @Override
    public void add(Object ele) {
        
        Node newNode = new Node(ele, null);
        if(head == null){
            head = newNode;
        } else {
            setCurrent(size);
            curr.setNext(newNode);
        }
        size++;
    }

    @Override
    public void add(int index, Object ele) {
        if(index == 1){
            curr = head;
            Node newNode = new Node(ele, head);
            head = newNode;
            
        } else {
            setCurrent(index);
            Node newNode = new Node(ele, curr);
            prev.setNext(newNode);
            
        }
        size++;
    }

    @Override
    public void remove(int index) {
        
        if(index == 1){
            head = head.getNext();
        }
        else{
        
            setCurrent(index);
            prev.setNext(curr.getNext() );
            
        }
        size--;
    }

    @Override
    public void printAll() {
        
        Node aNode = head;
        while(aNode != null){
            System.out.println(aNode.getEle());
            aNode = aNode.getNext();
        }
        
    }

    @Override
    public void removeAll() {
        
        head = null;
        curr = head;
        size = 0;
        
    }

    @Override
    public boolean isEmpty() {
        if(size == 0){
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public int size(){
        return size;
    }
}
