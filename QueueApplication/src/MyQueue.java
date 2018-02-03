/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x17143853
 */
import java.util.*;
/**
 *
 * @author x17143853
 */
public class MyQueue implements QueueInterface {
    //declare object
    ArrayList<String> theQueue;
    
    //initialize object with constructor
    public MyQueue(){
        theQueue = new ArrayList<String>();
    }
    
    //methods
    
    public void enqueue(Object obj){    
        theQueue.add(theQueue.size(), (String)obj);  
    }
    
    public void dequeue(){
        theQueue.remove(theQueue.get(0));
    }
    
    public int size(){
        return theQueue.size();
    };
    
    public boolean isEmpty(){
        if(theQueue.size() == 0){
            return true;
        } else {
            return false;
        }
    };
    
    public Object front(){
        return theQueue.get(0);
    };
}
