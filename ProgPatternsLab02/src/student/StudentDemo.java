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

package student;

import mylinkedlist.*;

/**
* An application class to test the methods in MyLinkedList.
* Class based on Programming Patterns' lab 2 (Java Generics - MyLinkedList).
* @author Giuliana Bouzon
*/
public class StudentDemo {

    public static void main(String[] args) {	
	
	//Q1, creating student objects
	Student s1 = new FullTimeStudent("1940108", "Albert");
	Student s2 = new PartTimeStudent("1940109", "Magnus");
	Student s3 = new PartTimeStudent("1940110", "Ronald");
	Student s4 = new FullTimeStudent("1940111", "Semi-colon");
	
	//testing Student child classes
	//System.out.println(s1);
	//System.out.println(s2);
	
	//Q2, creating MyLinkedList and adding students to it
	MyLinkedList<Student> studentList = new MyLinkedList<>();
	studentList.addFirst(s1);
	studentList.add(1, s2);
	studentList.add(2, s3);
	studentList.add(3, s4);
	
	//Q4, displaying the list, adding a new student, removing a student and displaying the list again
	System.out.println("Displaying the list after adding 4 students to it");
	MyLinkedList.display(studentList);
	System.out.println("-------------------------------------------------------------------------------");
	
	studentList.addLast(new PartTimeStudent("1940112", "Sarah"));
	System.out.println("Displaying the list after adding a part-time student to the last position");
	MyLinkedList.display(studentList);
	System.out.println("-------------------------------------------------------------------------------");
	studentList.removeLast();
	System.out.println("Displaying the list after removing last student");
	MyLinkedList.display(studentList);
	System.out.println("-------------------------------------------------------------------------------");
	
	//Q5, add a new PartTime student at index 2 in the list then remove the student at index 1 then display
	//use add(index, object) then remove(index)
	Student s5 = new PartTimeStudent("1940113", "newly added part-time dude");
	studentList.add(2, s5);
	System.out.println("Displaying the list after adding a part-time student to index 2");
	MyLinkedList.display(studentList);
	System.out.println("-------------------------------------------------------------------------------");
	studentList.remove(1);
	System.out.println("Displaying the list after removing student at index 1");
	MyLinkedList.display(studentList);
	System.out.println("-------------------------------------------------------------------------------");
	
	//Q6, check is the newly added part time student is in the list using contains() method, then display (index should be 1)
	//use contains(object) then indexOf(object)
	System.out.println("Is newly added part-time dude in the list? " + studentList.contains(s5));
	System.out.println("The index of newly added part-time dude is: " + studentList.indexOf(s5));
	System.out.println("-------------------------------------------------------------------------------");
	
	//Q7, change the name of the newly added student to John Doe 
	//use set(object, index)
	s5.setName("John Doe");
	studentList.set(s5, 1);
	System.out.println("Displaying the list after changing the name of newly added student to John Doe");
	MyLinkedList.display(studentList);
	System.out.println("-------------------------------------------------------------------------------");
	
	//Q8, construct a MyLinkedList from an array of mixed students then display
	//use the parameterized constructor of the MyLinkedList class.
	Student[] studentArray = {s1, s2, s3, s4, s5};
	MyLinkedList<Student> studentList2 = new MyLinkedList<>(studentArray);
	System.out.println("Displaying a list created using parameterized constructor of MyLinkedList");
	MyLinkedList.display(studentList2);
	System.out.println("-------------------------------------------------------------------------------");
    }
}