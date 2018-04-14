/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x17143853
 */
public class App {
    
    
    
    public static void main(String[] args) throws InterruptedException{
        
        Test obj1 = new Test();
        Test obj2 = new Test();
        Test obj3 = new Test();
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);
        
        t1.setDaemon(true);
        
        
        t1.start();
        t2.start();
        t3.start();
        
        
        
        Thread.sleep(1000);
        
        System.out.println("there are : " + Thread.activeCount() + " threads running");
        System.out.println( Thread.getAllStackTraces().size() );
        
    }
    
}
