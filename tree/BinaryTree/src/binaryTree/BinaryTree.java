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
public class BinaryTree {

    //variables
    public Node root;
    
    //constructor
    public BinaryTree(){
        root = null;
    }
    
    //methods
    public Node root(){
        return root;
    }
    
    public boolean isEmpty(){
        if( root == null){
            return true;
        } else {
            return false;
        }
    }
    
    public void insertNode(Node startNode, Node newNode){
        //special case
        if ( root == null){
            root = newNode;
        } else {
            
            if ( newNode.getElement() > startNode.getElement() ){
                
                if( startNode.getRightChild() == null) {
                    
                    startNode.setRightChild(newNode);
                    
                } else {
                    //recursion?
                    insertNode( startNode.getRightChild(), newNode);
                    
                }
            } else if ( newNode.getElement() < startNode.getElement() ){
                
                if(startNode.getLeftChild() == null ){
                    
                    startNode.setLeftChild(newNode);
                    
                } else {
                    
                    insertNode( startNode.getLeftChild(), newNode );
                }
                
            } else if ( newNode.getElement() == startNode.getElement() ){
                
                System.out.println( "This node has already been inserted");
            }
        }
    }
    
    public Node search( int searchedEle, Node startNode){
        //special case
        if( startNode == null){
            return null;
        } else  {
            
            if(startNode.getElement() == searchedEle){
                return startNode;
            } else if( startNode.getElement() > searchedEle ) {
                return search(searchedEle, startNode.getLeftChild());
            } else {
                return search(searchedEle, startNode.getRightChild());
            }
        }
    }
    
    public void inOrderTraversal(Node startNode){
        //special case
        if( startNode == null){
            return;
        } else {
            inOrderTraversal(startNode.getLeftChild());
            System.out.println(startNode.getElement());
            inOrderTraversal(startNode.getRightChild());
        }
        
    }
}
