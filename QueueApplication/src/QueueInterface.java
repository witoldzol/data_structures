/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x17143853
 */
public interface QueueInterface {
    
    public void enqueue(Object obj );
    
    public void dequeue();
    
    public int size();
    
    public boolean isEmpty();
    
    public Object front();
    
    
    
}
