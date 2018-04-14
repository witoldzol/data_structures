/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskthreaddemo;

/**
 *
 * @author x17143853
 */
public class ThreadExample implements Runnable {
public void run() {
for (int i = 0; i < 10000; i++)  {
    System.out.println(i);
    
    i++;
    i--;
}
}
public static void main(String[] args) {  
ThreadExample t1 = new ThreadExample();  
ThreadExample t2 = new ThreadExample();
ThreadExample t3 = new ThreadExample();

new Thread(t1).start();  
new Thread(t2).start();
System.out.println("Done");
}
}
