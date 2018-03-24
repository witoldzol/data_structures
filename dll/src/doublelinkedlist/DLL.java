/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlist;


public class DLL implements dll_interface {

    //variables
    private int size;
    private Node head, last, curr;
    //constructor
    public DLL(){
        size =0;
        head = null;
        last = null;
        curr = head;
    }
    //private method
    private void setCurrent(int index){
        
        curr = head;
        for (int i = 1; i < index; i++) {
            curr = curr.getNext();
        }
    }
    
    //implenetatins
    @Override
    public void add(int index, Object ele) {
        
        //special case
        if(size == 0){
            Node newNode = new Node(ele, null, null);
            curr = newNode;
            last = curr;
            head = curr;
            size++;
        } else {
            //add as head
            if(index == 1){
                setCurrent(index);
                
                Node newNode = new Node(ele, null, head);
                
                curr.setPrev(newNode);
                head = newNode;
                size++;
                /*
                //special case
                if(size == 1){
                    last = head.getNext();
                }
*/
            } else if (index == size + 1){ //enter last item
                
                setCurrent(size);
                Node newNode = new Node(ele, curr, null);
                curr.setNext(newNode);
                last = newNode;
                size++;
                
            } else {
                
                setCurrent(index);
                Node newNode = new Node(ele, curr.getPrev(), curr);
                curr.getPrev().setNext(newNode);
                curr.setPrev(newNode);
                size++;
            }
        }
        
    }

    @Override
    public void enqueue(Object ele) {
        //size 0 case
        if( size == 0 ){
            Node newNode = new Node(ele, null, null);
            curr = newNode;
            head = curr;
        } else {
            setCurrent(size);
            Node newNode = new Node(ele, curr, null);
            curr.setNext(newNode);
            last = newNode;
        }
        size++;
    }

    @Override
    public void dequeue() {
        setCurrent(size);
        curr.getPrev().setNext(null);
        last = curr.getPrev();
        
    }

    @Override
    public void remove(int index) {
        //special case
        if(size == 0){
            return;
        } else {
            //head
            if(index == 1){
                
                head = head.getNext();
                head.setPrev(null);
                
            //last 
            } else if (index == size +1) {
                
                last = last.getPrev();
                last.setNext(null);
                
            } else {
                
                setCurrent(index);
                curr.getPrev().setNext(curr.getNext());
                curr.getNext().setPrev(curr.getPrev());
                
            }
        }
    }
    
    @Override
    //will remove multiple items if found 
    public void remove(Object ele) {
       
        curr = head;
        //we decrement in order to avoid issues with changing index in 
        //case there are multiple items in the list
        for (int i = size; i > 0; i--) {
            
            curr = curr.getNext();
            
            if( curr.getEle().equals(ele) ){
                
                remove(i);
            }
        }
    }

    @Override
    public void removeAll() {
        head = null;
        curr = null;
        last = null;
    }

    @Override
    public boolean isEmpty() {
        
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
    
}
