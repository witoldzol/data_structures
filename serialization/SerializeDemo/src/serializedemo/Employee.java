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
public class Employee implements java.io.Serializable {
public String name;
public String address;
public transient int SSN;  public int number;

public void mailCheck() {
System.out.println("Mailing a check to " + name + " " +  address);
}
}
