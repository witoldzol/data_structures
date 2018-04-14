/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x17143853
 */
public class Test implements Runnable{

    private Object obj;
    
    @Override
    public void run() {
       
        long threadId = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        
        System.out.println("------------------------------");
        System.out.println("message from thread id : " + threadId + " name : " + name + "\nThere are currently : " + Thread.activeCount() + " active");
        System.out.println("------------------------------");
    }
    
    
    
    
}
