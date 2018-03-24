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
public interface dll_interface {
    
    public void add(int index, Object ele);
    public void enqueue(Object ele);
    public void dequeue();
    public void remove(int index);
    public void remove(Object ele);
    public void removeAll();
    public boolean isEmpty();
    public int size();
    
}
