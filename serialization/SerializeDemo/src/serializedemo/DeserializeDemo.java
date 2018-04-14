/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializedemo;

/**
 *
 * @author munaw
 */
import java.io.*;
public class DeserializeDemo {
public static void main(String [] args) throws Exception {
	//Employee e;
	FileInputStream fileIn = new FileInputStream("H:/Modules/test.txt"); 
	ObjectInputStream in = new ObjectInputStream(fileIn);
	Employee e = (Employee) in.readObject();
	in.close();  
	fileIn.close();

	System.out.println("Deserialized Employee...");  	
	System.out.println("Name: " + e.name);  	
	System.out.println("Address: " + e.address);  	
	System.out.println("SSN: " + e.SSN);  	
	System.out.println("Number: " + e.number);
     }
}
