/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorydemo;

/**
 *
 * @author HP
 */
public class MemoryDemo {
	public static void main(String[] args) throws InterruptedException {
            Runtime r = Runtime.getRuntime();
            long mem1, mem2;
            String someints[] = new String[10005];
            System.out.println("Total memory is: " + r.totalMemory());
            mem1 = r.freeMemory();
            System.out.println("Initial free memory: " + mem1);
            r.gc();
            mem1 = r.freeMemory();
            System.out.println("Free memory after garbage collection: " + mem1);
            
            for (int i = 0; i < someints.length; i++)
		someints[i] = i+""; // allocate integers
            
            mem2 = r.freeMemory();
            System.out.println("Free memory after allocation: " + mem2);
            System.out.println("Memory used by allocation: " + (mem1 - mem2));
            // discard Integers
            for (int i = 0; i < someints.length; i++)
		someints[i] = null;
		r.gc(); // request garbage collection
            Thread.sleep(100);
            mem2 = r.freeMemory();
            System.out.println("Free memory after collecting discarded String: " + mem2);
	}
}