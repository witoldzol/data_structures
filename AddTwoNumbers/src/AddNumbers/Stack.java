/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddNumbers;
import java.lang.reflect.Array;
import java.util.*;
/**
 *
 * @author x17143853
 */
public class Stack implements AddNumbersInterface{
    
    //array list init
    ArrayList<Integer> myStack = new ArrayList<>();
    
    public int add(int a, int b){
        int result;
        return result = a + b;
    };
    
    public void push(int a){
        myStack.add((Integer) a);
    };
   
    public void pop(){
        
        if( !myStack.isEmpty() ){
            myStack.remove(0);
        }
        
    };
    
    public int size(){
        int siz = myStack.size();
        return siz;
    };
    
  
    public int[] sort(){
        
        int[] sorted = new int [myStack.size()];
        
        int i = 0;
        for ( int ele : myStack){
            sorted[i] = ele;
            i++;
        }
       
       Arrays.sort(sorted);
      
       return sorted;
    };
    
    
    
}
