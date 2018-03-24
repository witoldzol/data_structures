/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.*;

/**
 *
 * @author x17143853
 */
public class MyArrayList<ElemType> extends ArrayList<ElemType>{
    
    
    int binarySearch_nonRecursive (ElemType key, int start, int end){
    
        boolean found = false;
      
        while( start<=end && found == false ){
            
            int middle  = (start + end) / 2;
            
            if( ((Comparable)get(middle)).compareTo((Comparable)key) == 0 ){
                found = true;
                //if value in middle is smaller than searched value
            } else if( ((Comparable)get(middle)).compareTo((Comparable)key) < 0 ) {
                start++;
            } else {
                start--;
            }
            if(found == true){
                return middle;
            }
        }
        //if we didn't find value, return -1 
        return -1;
    }
    
    int binarySearch_recursive (ElemType key, int start, int end){
    
        int middle = (start + end ) / 2;
        int result;
        //base level
        
        if( ((Comparable)get(middle)).compareTo((Comparable)key) == 0 ){
            result =  middle;
        } else if (start == end){
            result =  -1;
        } else {

            if (((Comparable)get(middle)).compareTo((Comparable)key)<0 )

                    result = binarySearch_nonRecursive(key, middle + 1, end);
            else 
                    result = binarySearch_nonRecursive(key, start, middle -1 );

        }
        return result;
        
    }  
}
