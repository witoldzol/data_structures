
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package doublelinkedlistexample;

public class DLList {
    private DlNode head;
    private DlNode last;
    private DlNode curr;
    private int size;

    DLList(){
        head = null; 
        last = null; 
        size = 0;
        curr = head;
    }
    public boolean isEmpty(){
	 return (size == 0);
    }
    public int size(){
	 return size;
    }
    private void setCurrent(int index){
	curr = head;
	for (int k  = 1; k < index; k++){
		curr = curr.getNext();
        }
    }
    public void add(int index, Object theElement)
    {
        //add here the code that implements operation
        //that adds a new node on a given position (index)
        if (size == 0){
            DlNode newNode = new DlNode(theElement, null, null);
            curr = newNode;
            head = curr;
            last = curr;
            size++;
        } else {
            // Insert a new Node at the head position
            if (index == 1){
                setCurrent(index);              // go to the first item
                DlNode newNode = new DlNode(theElement, curr, null);
                curr.setPrev(newNode);
                head = newNode;
                size++;
            }
            // Insert a new Node at the last position
            else if (index == (size + 1)){
                setCurrent(size);           // got to the last item
                DlNode newNode = new DlNode(theElement, null, curr);
                curr.setNext(newNode);
                last = newNode;
                size++;
            }
            else {
                // Insert a new node in the middle
                setCurrent(index);
                DlNode newNode = new DlNode(theElement, curr, curr.getPrev());
                curr.getPrev().setNext(newNode);
                curr.setPrev(newNode);
                size++;
            }
        }

    }


   public void remove(int index)
    {
        if (size > 0)
        {
            setCurrent(index);

            // If current item is the head, then the head become the next right node after current
            if (curr == head) {
                head = curr.getNext();
                head.setPrev(null);
            } 
            // If current item is the last, then the last become the previous right before current
            else if(curr == last)
            {
                last = curr.getPrev();
                last.setNext(null);
            } else {
            // If current item is not the last or the first, then the element to be removed is in the middle
                DlNode  prev = curr.getPrev();
                DlNode next = curr.getNext();

                prev.setNext(next);
                next.setPrev(prev);
            }
            curr = null;
            size--;
        }
    }


    public Object get(int index) {
      setCurrent(index);
      return curr;
   }
    
    
    
    //************************************************************/
    // Provide a printlist() method which will print out       */
    // the contents of the double linked list, starting with he first node                                */
    //************************************************************/

    public void printList()
    {
         for (DlNode aNode = head; aNode != null; aNode = aNode.getNext())
         {
            System.out.println(aNode.getElement());
         }
    }
    
    //************************************************************/
    // Provide a printBackwardList() method which will print out       */
    // the information from the nodes starting from the last node up to the first node                                */
    //************************************************************/

    public void printBackwardList()
    {
         // write your code here
        
         for (DlNode aNode = last; aNode != null; aNode = aNode.getPrev())
         {
            System.out.println(aNode.getElement());
         }
        
    }
    
}

    
    