/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.*;
/**
 *
 * @author x17143853
 */
public class MyStack implements StackInterface{
    //declare stack 
    public ArrayList<String> theStack;
    //initialize stack object
    public MyStack(){
        theStack = new ArrayList<>();
    }
    
    // METHODS
    //
    @Override
    public boolean isEmpty(){
        return theStack.isEmpty();
    };
    
    @Override
    public void push(String item){
    
        theStack.add(0, (String) item);
    };
    
    @Override
    public String pop(){
        
        if( !(theStack.isEmpty()) ){
            return theStack.remove(0);
        } else {
            return null;
        }
        
        
    };
    @Override
    public void emptyStack(){
       int ind = theStack.size();
               
       for(int i = 0; i<ind; i++){
           pop();
       }
        
    }
    @Override
    public void printStack(){
        
        for( String ele : theStack){
            System.out.println( ele );
        }
    
    }
   
    @Override
    public int count(){
        
        return theStack.size();
    }
    
    @Override
    public String displayStack(){
        
        String str = theStack.toString();
        return str;
        
        
    }
}