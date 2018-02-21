/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinkedlistapp;

/**
 *
 * @author x17143853
 */
public interface sll_interface {
    
    public void add(Object ele);
    
    public void add(int index, Object ele);
    
    public void remove(int index);
    
    public void printAll();
    
    public void removeAll();
    
    public boolean isEmpty();
    
    public int size();
    
    public Node get(int index);        

}
