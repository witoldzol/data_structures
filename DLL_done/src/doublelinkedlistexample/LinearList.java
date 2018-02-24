/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package doublelinkedlistexample;

public interface LinearList {
    public boolean isEmpty();
    public int size();
    public void setCurrent(int index);
    public void add(int index, Object theElement);
    public void remove(int index);
    public Object get(int index);
    public void printList();
    public void printBackwardList();
}

