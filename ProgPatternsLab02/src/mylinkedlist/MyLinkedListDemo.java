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

/**
 * An application class to test the methods in MyLinkedList.
* Class based on Programming Patterns' lab 2 (Java Generics - MyLinkedList).
* @author Giuliana Bouzon
*/
public class MyLinkedListDemo {

    public static void main(String[] args) {
	
	//creating the linked list
	MyLinkedList<String> list1 = new MyLinkedList<>();
	
	//testing addFirst() method
	list1.addFirst("Vanier");
	list1.addFirst("College");
	
	//testing addLast() method
	list1.addLast("Here");
	list1.addLast("We are");
	
	//displaying the list
	MyLinkedList.display(list1);
	    
	//testing size() method
	System.out.println("The size is: " + list1.size());
	
	//testing isEmpty() method
	System.out.println("Is list empty? " + list1.isEmpty());
	
	//testing clear() method
	list1.clear();
	System.out.println("Is MyLinkedList empty after clear()?" + list1.isEmpty());
	
	//testing parameterized constructor
	Integer[] nums = {2, 3, 0, -2, 5};
	MyLinkedList<Integer> list2 = new MyLinkedList<>(nums);
	
	MyLinkedList.display(list2);
    }
}