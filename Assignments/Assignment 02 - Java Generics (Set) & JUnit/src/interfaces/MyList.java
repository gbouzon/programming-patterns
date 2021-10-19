/** MIT License Copyright (c) 2021 Giuliana Bouzon

* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:

* The above copyright notice and this permission notice shall be included in
* all copies or substantial portions of the Software.

* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
* THE SOFTWARE.
*/

package interfaces;

/**
* An interface listing the required methods for MyLinkedList/MySet class.
* Based on Programming Patterns' Assignment 2 (Java Generics - MySet).
* @author Giuliana Bouzon
*/
public interface MyList<E> {
    
    /**
     * Empties the list. Head and tail become null.
     */
    public void clear();
    
    /**
     * Checks if the list is empty.
     * @return true is the list is empty and false if otherwise.
     */
    public boolean isEmpty();
    
    /**
     * Checks if the list contains a specified element.
     * @param element, the input E value.
     * @return true if the list contains the specified element.
     */
    public boolean contains(E element);
    
    /**
     * Looks for the index of a specified element in the list.
     * @param element, the input E value.
     * @return the index of the element.
     */
    public int indexOf(E element);
    
    /**
     * Looks for the element at a specified index in the list.
     * @param index, the input int value.
     * @return the element.
     */
    public E get(int index);
    
    /**
     * Sets the element at the specified index to the specified value.
     * @param element, the new value.
     * @param index, the index of the element to be modified.
     */
    public void set(E element, int index);
    
    /**
     * Retrieves the size of the list.
     * @return the size of the list.
     */
    public int size();
    
    /**
     * Adds the specified element to the specified index in the list.
     * @param index, the position of the element to be added.
     * @param element, the element to be added to the list.
     */
    public void add (int index, E element);
    
    /**
     * Removes the element at the specified index in the list.
     * @param index, the position of the element to be removed.
     * @return the element to be removed.
     */
    public E remove(int index);
}