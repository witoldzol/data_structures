
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.stream.Stream;
import static javafx.scene.input.KeyCode.H;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x17143853
 */
public class FileOperations {

    public void writeToFile( String filePath, String input ) throws IOException{
       
        BufferedWriter writer = null;
        
        try{          
            writer = new BufferedWriter( new FileWriter( filePath, true ));
            writer.newLine( );
            writer.write( input );
            
        }catch ( IOException e ){
            System.out.println(e);
        }
        finally{
            
            try{
                
                if( writer != null ){
                    
                    writer.close();
                    
                }
            }catch( IOException e){
                System.out.println(e);
            }
               
            }
                
    }
    
    public void readFromFile( String fileName ) throws FileNotFoundException, IOException{
        
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
        
        String line;
        
    while ((line = br.readLine()) != null) {
       System.out.println( line );
    }
}
        
    }
    
    public void readAndWrite( String originFile, String destinationFile) throws FileNotFoundException, IOException{
        
        try (BufferedReader br = new BufferedReader( new FileReader( originFile ))){
            
            String line;
            
            while ( (line = br.readLine() ) != null ){
                
                writeToFile( destinationFile, line);            }
        }
        
        
        
        
    }
}
