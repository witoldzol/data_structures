/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sll;


public class sll implements sll_interface {

    //variables
    private Node prev, curr, head;
    private int size;
    
    //constructor
    public sll(){
        prev = null;
        curr = null;
        head = null;
        size = 0;
    }
    
    //private method
    private void setCurrent(int index){
        curr = head;
        prev = null;
        //start from 1 !! (there is no index 0 node that is accessible)
        for (int i = 1; i < index; i++) {
            prev = curr;
            curr = curr.getNext();
        }
    }
    
    @Override
    public void add(int index, Object ele) {
        //special case
        if(index==1){           
            Node newNode = new Node(ele, head);
        }
        else{
            setCurrent(index);
            Node newNode = new Node(ele, curr);
            prev.setNext(newNode);
        }
        size++;
    }

    @Override
    public void add(Object ele) {
        
        Node newNode = new Node(ele,null);
        //special case
        if(head == null){
            
            head = newNode;
        
        } else {
            
            setCurrent(size);
            curr.setNext(newNode);
        
        }        
        size++;
    }

    @Override
    public int size() {
        return size;
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
    public void remove(int index) {
        //special case
        if(index == 1){
            head = head.getNext();
        } else {
            
            setCurrent(index);
            prev.setNext(curr.getNext());
        }
        size--;
        
    }

    @Override
    public void remove() {
        //special case
        if(size == 1){
            head = null;
        } else {
            setCurrent(size);
            prev.setNext(null);
        }
        size--;
    }
    @Override
    public void remove(Object ele){
        //we traverse list from the end\
        for(int i = size; i>0; i--){
            System.out.println("index: " + i + " element: " + get(i));
            System.out.println(get(i).equals(ele));
            if(get(i).equals(ele)){
                remove(i);
            }
            
        }
        
    }
    
    @Override
    public void removeAll() {
        //java has automatic garbage collection, 
        //so all we need  to do is null first link
        head = null;
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
    public Object get(int index) {
        
        setCurrent(index);
        return curr.getEle();
    }

    
}
