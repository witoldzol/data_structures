/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortexample;

import java.util.*;

public class MyArrayList<ElemType> extends ArrayList<ElemType>
{
     // this is a relatively efficient bubble sort ( as bubble sorts go ). It recognises that after each
    // pass of the outer loop an additional rightmost element is in the correct position and can be ignored
    public void bubbleSort()
    {
       int i,j;
       Comparable currentEle,nextEle;
       for (i=0; i < size(); i++ )
       {

	  for (j=0; j < size()-1 -i ; j++ )
	  {
              currentEle = (Comparable)get(j);
              nextEle = (Comparable)get(j+1);


	      if (currentEle.compareTo(nextEle) > 0)
	      {
		//swap element on postion j with element on position j+1
                  swap(j, j+1);
	      }
           }
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


     public void simplebubblesort()
    {
         //TASK 6: write code for the simplebubblesort() method
         //The simpler bubble sort method  simply compares neighbours repeatedly
         //until there are no more swaps
        
        Comparable curr, next;
        
        for(int i = 0; i < size(); i++ ){
            
            for(int j = 0; j < size()-1; j++){
                
                curr=(Comparable)get(j);
                next=(Comparable)get(j+1);
                
                if(curr.compareTo(next) > 0){
                    
                    swap(j,j+1);
                }
                
            }
        }

     }

}
