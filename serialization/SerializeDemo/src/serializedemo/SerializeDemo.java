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
public class SerializeDemo {
public static void main(String [] args) throws Exception {
    Employee e = new Employee();
    e.name = "Glen Ward";
    e.address = "Yellow Brick Road";  
    e.SSN = 11122333;
    e.number = 101;

    FileOutputStream fileOut = new FileOutputStream("H:/Modules/test.txt");  
    ObjectOutputStream out = new ObjectOutputStream(fileOut);  out.writeObject(e);
    out.close();  
    fileOut.close();
    System.out.println("H:/Modules/data_structures/serialization/SerializeDemo/src/serializedemo");
      }
  }
