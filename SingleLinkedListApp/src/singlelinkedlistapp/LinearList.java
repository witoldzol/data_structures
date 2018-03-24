/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinkedlistapp;

public interface LinearList {
    public boolean isEmpty();
	public int size();
	public Object get(int index);
	public void remove(int index);
	public void add(int index, Object theElement);
        public void add(Object element);
	public void printList();
        //add new method to interface -- print odd numbers
        public void printOdd();
        //add new method -- print reverse
        public void printReverse();

}
