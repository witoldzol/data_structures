/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlist;

/**
 *
 * @author x17143853
 */
public class DLLApp {
    
    
    public static void main(String[] main){
        
        dll_interface dl = new DLL();
        
        System.out.println("is the new list empty? : " + dl.isEmpty() );
        
        
        dl.enqueue("bob");
        dl.enqueue("ada");
        dl.enqueue("bodfadfb");
        dl.enqueue("fddffd");
       /* 
        dl.add(1,"bob");
        dl.add(2,"jon");
        dl.add(3,"don");
        dl.add(4,"sport");
        */
        System.out.println("size is: " + dl.size());
        System.out.println("still empty? : " + dl.isEmpty() );
        
        
        
    }
    
}
