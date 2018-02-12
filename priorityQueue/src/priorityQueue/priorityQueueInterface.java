/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityQueue;

/**
 *
 * @author x17143853
 */
public interface priorityQueueInterface {
    
    public void add(PriorityQueueElement obj );
    
    public void remove(Object e);
    
    public void dequeue();
    
    public Object printQueue();
    
    public int size();
    
    public boolean isEmpty();
    
    
}
