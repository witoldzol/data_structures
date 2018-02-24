/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package doublelinkedlistexample;

public class DlNode {
private Object element;
	private DlNode next;
	private DlNode prev;

    public DlNode(Object e, DlNode n, DlNode p){
	element = e;
	next = n;
        prev = p;
    }
    public DlNode getNext() {
	return next;
    }
    public void setNext(DlNode n) {
	next = n;
    }
    public DlNode getPrev() {
	return prev;
    }
    public void setPrev(DlNode p) {
	prev = p;
    }
    public Object getElement() {
        return element;
    }

    public void setElement(Object e) {
	element = e;
    }

}
