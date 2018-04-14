/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author x17143853
 */
public class ReadWrite {
    
    
    public static void main(String[] args) throws IOException{
        
        String input;
        
        String fileName = "H:/origin.txt";  
        String otherFile = "H:/destination.txt";
        
        Scanner scan = new Scanner(System.in);
        FileOperations fo = new FileOperations();
        
        System.out.println("Please enter word");

        input = scan.nextLine();
        
        System.out.println("Your have entered :\n" + input);
     
        File f = new File(fileName);
        
         if(f.createNewFile())System.out.println("Success!");
         else System.out.println ("Error, file already exists.");
        
        fo.writeToFile(fileName, input);
     
        fo.readFromFile(fileName);
        
        fo.readAndWrite(fileName, otherFile);
    }
    
    
}
    

