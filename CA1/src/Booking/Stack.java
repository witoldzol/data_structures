/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Booking;

import java.util.ArrayList;

/**
 *
 * @author x17143853
 */
public interface Stack {
    
    public void push(String name);
    
    public void pop();
    
    public String[] displayStack();
    
    public boolean cancelTable( String name );
    
    public boolean isFull();
    
    public int tableNumber();
    
    public int checkForCancelled();
    
    public void insert( int index, String name);
    
}
