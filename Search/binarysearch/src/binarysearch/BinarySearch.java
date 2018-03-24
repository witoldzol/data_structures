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
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int key = 10;
        MyArrayList<Integer> mylist;
        mylist = new MyArrayList<Integer>();

        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(5);
        mylist.add(6);
        mylist.add(7);
        mylist.add(8);
        mylist.add(9);
        mylist.add(10);
        mylist.add(11);
        mylist.add(12);
        
        System.out.println("the values are : " + mylist.toString());
        
        
        System.out.println("result of search non recursive is  : " + mylist.binarySearch_nonRecursive(key, 0, mylist.size()-1));
        System.out.println("result of search --- recursive is  : " + mylist.binarySearch_recursive(key, 0, mylist.size()-1));
        
        
        
        
        // Add 10 values to the mylist2 using add method
        // Then call binarySearch_nonRecursive and binarySearch_recursive
    }

}