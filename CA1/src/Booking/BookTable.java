/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Booking;

import java.util.ArrayList;


public class BookTable implements Stack {
    
//declare list
    ArrayList<String> tableStack;
    
    public BookTable(){
        tableStack = new ArrayList<>();
    }
    
    @Override
    public void push(String name) {
        tableStack.add(name);
    }

    @Override
    public void pop() {
        tableStack.remove(0);
    }

    @Override
    public String[] displayStack() {
        
        String[] arr = new String[tableStack.size()];
        arr = tableStack.toArray(arr);
        
        return arr;
        
    }

    @Override
    public boolean cancelTable (String name ) {
        
        String c = "Cancelled";
        int index = 0;
        
        
        
        
        for( String ele : tableStack)
        {
            if (ele.equals(name)){
                tableStack.set(index, c);
                return true;
            } else{
                index++;
            }
        }                
    return false;
    
    }
    

    @Override
    public boolean isFull() {
        
        if(tableStack.size() == 6){
            return true;
        } else {
            return false;
        }
        
    }
    
    @Override
    public int tableNumber(){
        return tableStack.size();
    }
    
    @Override
    public int checkForCancelled(){
        
        int emptyTable = 7;
        
        String[] arr = new String[tableStack.size()];
        arr = tableStack.toArray(arr);
        
        for (int i = 0; i < 6; i++) {
            if(arr[i] == "Cancelled"){
                emptyTable = i;
                return emptyTable;
            }
        }
        
        return emptyTable;
        
    };
    
    @Override
    public void insert( int index, String name){
        
        tableStack.set(index, name);
        
    };
}
