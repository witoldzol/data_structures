/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionSorting;

import java.util.*;
/**
 *
 * @author x17143853
 */
public class MyList<ElemType> extends ArrayList<ElemType> {
   
   public void insertSort(){
   
       ElemType ele;
       int i,pos;
       
       for (i = 1; i < size(); i++) {
       
           ele = get(i);
           pos = i;
           
           //as long as the current value is bigger than the last value in 
           //our 'sub string' of values we can keep incrementing search values
           while (pos >= 0 &&  ((Comparable)get(pos-1)).compareTo((Comparable)ele) > 0) {
               //get the value of the element 
               ElemType beforeEle = get(pos-1);
               //put it in the position of the ele that was smaller
               set(pos, beforeEle);
               //decrement j counter ( we will continue until we go negative)
               pos--;
           }
           //once we are done pushing 'up' the 'higher' value
           //we restore the original value at correct position
           
          set(pos, ele);
           
       }
       
   }   
         
   public void swap(int pos1, int pos2)
     {
         //TASK1: write your code here
         
         //Create two objects that will store the info from the two positions
         ElemType tempObject;
         
         tempObject = get(pos1);
         
         set(pos1, get(pos2));
         set(pos2, tempObject);
         
    }
}
