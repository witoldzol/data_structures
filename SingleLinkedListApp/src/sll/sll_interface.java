/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sll;

/**
 *
 * @author esu
 */
public interface sll_interface {
    
    public void add(int index, Object ele);
    public void add(Object ele);
    public int size();
    public boolean isEmpty();
    public void remove(int index);
    public void remove(Object ele);
    public void remove();
    public void removeAll();
    public void printAll();
    public Object get(int index);
    
}
