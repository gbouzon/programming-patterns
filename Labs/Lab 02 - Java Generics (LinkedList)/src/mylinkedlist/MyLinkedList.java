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

package mylinkedlist;

import interfaces.MyList;

/**
* A simple MyLinkedList class defining MyLinkedList objects (generic implementation of a LinkedList).
* Class based on Programming Patterns' lab 2 (Java Generics - MyLinkedList).
* @author Giuliana Bouzon
*/
public class MyLinkedList<E> implements MyList<E> {
    
    //properties
    private Node<E> head;
    private Node <E> tail;
    private int size;
    
    //default constructor
    public MyLinkedList(){}
    
    //parameterized constructor
    public MyLinkedList(E[] elements) {
	for (E element : elements)
	    this.addLast(element);
    }
    
    /**
     * Adds the specified element to index 0 of the list.
     * @param element, the input E value.
     */
    public void addFirst(E element) {
      Node <E> newNode = new Node<>(element);
      newNode.next = head;
      head = newNode;
      size++;
      if (tail == null)
	  tail = head;
    }
    
    /**
     * Adds the specified element to index size - 1 of the list.
     * @param element, the input E value.
     */
    public void addLast(E element) {
        if (tail == null){
            head = tail = new Node<>(element);
        } 
        else {
            tail.next = new Node<>(element);
            tail = tail.next;
        }
        size++;
    }
    
    /**
     * Returns the element in index 0 (head node) of the list.
     * @return ^
     */
    public E getFirst() {
        if (this.isEmpty()) throw new IndexOutOfBoundsException();
        	return head.element;
    }
    
    /**
     * Returns the element in index size - 1 (tail node) of the list.
     * @return ^
     */
    public E getLast() {
        if (this.isEmpty()) throw new IndexOutOfBoundsException();
        	return tail.element;
    }
    
    /**
     * Removes the element in index 0 (head node) of the list.
     * @return ^
     */
    public E removeFirst() {
        if (this.isEmpty()) throw new IndexOutOfBoundsException();
        else {
            Node <E> temp = head;
            head = head.next;
            size--;
            if (head == null) 
        	tail = null;
                
        return temp.element;  
        }
    }
    
    /**
     * Removes the element in index size - 1 (tail node) of the list.
     * @return ^
     */
    public E removeLast() {
        if (this.isEmpty()) throw new IndexOutOfBoundsException();
        else {
            Node<E> temp = null;
            Node<E> current = head;
            if (size == 1) 
        	head = tail = null;
            else {
                for (int i = 0; i < size - 2; i++) 
                    current = current.next;
                
                temp = tail;
                tail = current;
                tail.next = null;  
            }
            size--;
            return temp.element;
        }
    }
    
    /**
     * Empties the list, aka head AND tail are null.
     */
    public void clear() {
        this.head = null;
        this.size = 0;
    }
    
    /**
     * Checks if the list is empty.
     * @return true if the list is empty and false if otherwise.
     */
    public boolean isEmpty() {
        if (size == 0 && head == null)
            return true;
        
        return false;
    }
    
    /**
     * Checks if the list contains a specified element.
     * @param element, the input E value.
     * @return true if the list does contain the specified element and false if otherwise.
     */
    public boolean contains(E element) {
        if (this.isEmpty()) throw new IndexOutOfBoundsException();
        else {
            for (int i = 0; i <= this.size - 1; i++) {
                if (this.get(i).equals(element))
                    return true;
            }
        }
        return false;
    }
    
    /**
     * Returns the index of the specified element in the list.
     * @param element, the input E value.
     * @return ^^
     */
    public int indexOf(E element) {
        Node<E> current = this.head;
        int index = 0;
        while (current != null && current.element != null) {
            if (current.element.equals(element)){
                return index;
            }
            else {
                current = current.next;
                index++;
            }
        }
        return -1;
    }
    
    /**
     * Returns the element at the specified index
     * @param index, the input int value, aka the index
     * @return the E element.
     */
    public E get(int index) {
	if ((size != 0) && (index <= size - 1) && (index >= 0)) {
	    int i = 0;
	    Node<E> current = head;
	    while (i < index) {
		current = current.next;
		i++;
	    }
	    return current.element;
	}
	else {
	    throw new IndexOutOfBoundsException();
	}
    }
    
    /**
     * Sets the element at the specified index to the specified E element.
     * @param element, the E element to be ^
     * @param index, the input int value.
     */
    public void set(E element, int index) {
        Node<E> current = head;
	int i = 0;
	while (i < index) {
	    current = current.next;
	    i++;
	}
	current.element = element;
    }
    
    /**
     * Returns the size of the list.
     * @return ^^
     */
    public int size() {
        return this.size;
    }
    
    /**
     * Adds the specified element to the specified index of the list.
     * @param index, the input int value.
     * @param element
     */
    public void add(int index, E element) {
        if (index == 0)
            addFirst(element);
        else if (index >= size)
            addLast(element);
        else {
            Node <E> current = head;
            for (int i = 0; i < index - 1; i++)
                current = current.next;
            Node<E> temp = current.next;
            current.next = new Node<>(element);
            (current.next).next = temp;
            size++;
        }
    }
    
    /**
     * Removes the element at the specified index of the list.
     * @param index, the input int value.
     * @return 
     */
    public E remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        else if (index == 0)
            return removeFirst();
        else if (index == size - 1)
            return removeLast();
        else {
            Node <E> previous = head;
            for (int i = 0; i < index - 1; i++){
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }
    
    /**
     * Displays the elements in the list in a *pretty-ish* way
     * @param list, the input list
     */
    public static void display(MyLinkedList list) {
        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.println(list.get(i));
        }
    }
}
