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

//this is a class of an object / element / that we will 
//add /remove from our linked list
public class PriorityQueueElement {
    
    //variables
    private int priority;
    private Object element;
    
    //constructor
    public PriorityQueueElement(int x, Object y)
    {
        priority = x;
        element = y;
    }
    
    //setter
    public void setPriority(int priority)
    {
        this.priority = priority;
    }    
    
    public void setElement(Object ele)
    {
        this.element = ele;
    }
    //getter 
    public int getPriority()
    {
        return priority;
    }
    public Object getElement()
    {
        return element;
    }
    
    
    
}
