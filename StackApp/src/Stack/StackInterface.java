/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.ArrayList;

/**
 *
 * @author x17143853
 */
public interface StackInterface {
    
    public boolean isEmpty();
    
    public void emptyStack();
    
    public void push(String item);
    
    public String pop();
    
    public void printStack();
    
    public int count();
    
    public String displayStack();
    
}
