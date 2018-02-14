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
public class PQEle {
    
    //variables
    int priority;
    String name;
    
    //constructor
    public void PQEle(int p, String n){
        priority = p;
        name = n;
    }
    
    //getter
    public int getPriority(){
        return priority;
    }
    
    public String getName(){
        return name;
    }
    
}
