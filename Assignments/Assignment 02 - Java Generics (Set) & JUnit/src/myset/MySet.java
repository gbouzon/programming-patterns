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

package myset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import interfaces.MyList;

/**
* A simple MySet class defining MySet objects (generic implementation of a Set).
* Class based on Programming Patterns' Assignment 02 (Java Generics - MySet).
* Class based on MyLinkedList from Programming Patterns' Lab 02.
* @author Giuliana Bouzon
*/
public class MySet<E> implements MyList<E> {
    
    //properties
    private Node<E> head;
    private Node<E> tail;
    private int size;
    
    //default constructor
    public MySet() {}
    
    //parameterized constructor
    public MySet(List<E> otherList) {
	for (E element : otherList)
	    this.add(element);
    }
    
    //parameterized constructor
    public MySet(E[] arr) {
	this(new ArrayList<E>(Arrays.asList(arr)));
    }
    
    /**
     * Adds an element to the set (only if it isn't already in the set).
     * @param element
     * @return true if the element is added.
     */
    public boolean add(E element) {
	if (this.indexOf(element) < 0) {
	    this.add(this.size, element);
	    return true;
	}
	return false;
    }
    
    /**
     * Removes an element from the set.
     * @param element
     * @return true if the element is found and removed.
     */
    public boolean remove(E element) {
	int position = this.indexOf(element);
	
	if (position >= 0) {
	    this.remove(position);
	    return true;
	}
	return false;    
    }
    
    /**
     * Merges two sets. All distinct elements from both sets are added into one.
     * @param otherSet
     * @return a set containing elements from both sets.
     */
    public MySet<E> union(MySet<E> otherSet) {
	E element;
	
	for (int i = 0; i < otherSet.size(); i++) {
	    element = otherSet.get(i);
	    this.add(element);
	}
	return this;
    }
    
    /**
     * All elements existing in both sets are added into one.
     * @param otherSet
     * @return a set containing the repeating elements in both sets.
     */
    public MySet<E> intersection(MySet<E> otherSet) {
	E element;
	
	for (int i = 0; i < this.size(); i++) {
	    element = this.get(i);
	    if (!otherSet.contains(element))
		this.remove(element);
	}
	return this;
    }
    
    /**
     * All elements existing in only one of the sets are added into one.
     * @param otherSet
     * @return a set containing the distinct elements in both sets.
     */
    public MySet<E> difference(MySet<E> otherSet) {
	E element;
	
	for (int i = 0; i < otherSet.size(); i++) {
	    element = otherSet.get(i);
	    if (this.contains(element))
		this.remove(element);
	    else this.add(element);
	}
	    
	return this;
    }

    @Override
    public void clear() {
	this.head = null;
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
	if (size == 0 && head == null)
            return true;
        
        return false;
    }

    @Override
    public boolean contains(E element) {
	if (this.isEmpty()) return false;
        else {
            for (int i = 0; i <= this.size - 1; i++) {
                if (this.get(i).equals(element))
                    return true;
            }
        }
        return false;
    }

    @Override
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

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
	if ((size != 0) && (index <= size - 1) && (index >= 0)) {
	    int i = 0;
	    Node<E> current = head;
	    while (i < index) {
		current = current.next;
		i++;
	    }
	    return current.element;
	}
	else throw new IndexOutOfBoundsException("Index invalid.");
    }

    @Override
    public void set(E element, int index) {
	if (this.get(index).equals(element)) {
	    System.out.println("\tElement at index '" + index + "' is already set to that value.");
	}
	else if (this.contains(element)) {
	    System.out.println("\tSet already contains that value. Element at index '" + index + "' cannot be changed to specified value");
	}
	else {
	    Node<E> current = head;
	    int i = 0;
	    while (i < index) {
		current = current.next;
		i++;
	    }
	    current.element = element;
	}
    }

    @Override
    public int size() {
	return this.size;
    }
    
    @Override
    public void add(int index, E element) {
	if (this.indexOf(element) < 0) {
	    if (index <= 0) {
		Node <E> newNode = new Node<>(element);
		      newNode.next = head;
		      head = newNode;
		      size++;
		      if (tail == null)
			  tail = head;
	    }
	    else if (index >= size) {
		if (tail == null) {
	            head = tail = new Node<>(element);
	        } 
	        else {
	            tail.next = new Node<>(element);
	            tail = tail.next;
	        }
	        size++;
	    }
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
	else return;
    }

    @Override
    public E remove(int index) throws IndexOutOfBoundsException {
	if (this.isEmpty())
	    throw new IndexOutOfBoundsException("Cannot remove elements from an empty list.");
	
	else if (index < 0 || index >= size) 
            throw new IndexOutOfBoundsException("Invalid index. Removal could not be completed.");

        else if (index == 0) {
            Node <E> temp = head;
            head = head.next;
            size--;
            if (head == null) 
        	tail = null;
                
            return temp.element;
        }
        else if (index == size - 1) {
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
     * a toString method to convert set into string
     * @return string.
     */
    public String toString() {
	String str = "";
	
        for (int i = 0; i <= this.size() - 1; i++) 
            str += this.get(i) + " ";
        
        return str;
    }
}
