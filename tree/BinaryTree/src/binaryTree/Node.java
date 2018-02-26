/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryTree;

/**
 *
 * @author x17143853
 */
public class Node {
 
    //variables
    private int element;
    private Node leftChild, rightChild;
    
    //constructor
    public Node(int i){
        element = i;
        leftChild = rightChild = null;
    }
    
    //setters
    public void setLeftChild(Node n){
        leftChild = n;
    }
    
    public void setRightChild(Node n){
        rightChild = n;
    }
    
    //getters
    public int getElement(){
        return element;
    }
    
    public Node getRightChild(){
        return rightChild;
    }
    
    public Node getLeftChild(){
        return leftChild;
    }
    
    //methods
    public boolean isLeaf(){
        return ( (leftChild == null) && (rightChild == null) );
    }
    
    public boolean isInternal(){
        if( (leftChild != null) || (rightChild != null) ){
            return true;
        } else {
            return false;
        }
    }
    
    
}
