/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package linearsearchexample;
import java.util.*;
/**
 *
 * @author cmuntean
 */

public class MyArrayList<ElemType> extends ArrayList<ElemType>
{



    public int unordered_sequentialSearch(ElemType key)
    {
        for (int i = 0; i < size(); i++) {
            
            if( ((Comparable)key).compareTo( (Comparable)get(i) ) == 0){
                
                return i;
            } 

        }
        
        return -1;

     }


    public int ordered_sequentialSearch(ElemType key)
    {
        int k = 0; 
        
        //SPECIAL CASE -- if first element is equal to searched value // we test only if key is bigger (not equal - in loop)
        if(( ((Comparable)key).compareTo( (Comparable)get(0) ) == 0 )){
            return 0;
        }
        
        while( ( ((Comparable)key).compareTo( (Comparable)get(k) ) == 1 ) && k<size() ){   
            
            k++;
            if( ((Comparable)key).compareTo( (Comparable)get(k)) == 0 ){
                return k;
            } 
        }
        

        // Write code for searching on unordered list
        return -1;  // Change this statement according to your requirement
    }  
}

