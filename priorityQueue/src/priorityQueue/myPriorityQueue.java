/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityQueue;

import java.util.ArrayList;


public class myPriorityQueue implements priorityQueueInterface {

    //queue declaration
    ArrayList<PriorityQueueElement> pq;
    
    public myPriorityQueue(){
        
        //queue instantiation
        pq = new ArrayList();
    }
    
    @Override
    public void add(PriorityQueueElement ele ) {
        
        int p = ele.getPriority();
        
        for(int i = 0; i<pq.size(); i++){
            
            //finish
            
        }
        
    }

    @Override
    public void remove(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dequeue() {
        
    }

    @Override
    public Object printQueue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        return pq.size();
    }

    @Override
    public boolean isEmpty() {
        if(pq.size() == 0){
            return true;
        } else {
            return false;
        }
    }
    
}
