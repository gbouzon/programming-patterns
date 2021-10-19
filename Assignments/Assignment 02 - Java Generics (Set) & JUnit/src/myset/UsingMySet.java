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

/**
* An application class to test the methods in MySet.
* Class based on Programming Patterns' Assignment 02 (Java Generics - MySet).
* @author Giuliana Bouzon
*/
public class UsingMySet {

    public static void main(String[] args) {	
	//creating list and array to test constructors
	Integer[] arr = {2, 5, 8, 9};
	Integer[] arr2 = {4, 5, 6, 7, 8};
	ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
	String[] strArr = {"Hello", "World", "Test", "Test", "Test3"};
	
	//creating MySet objects using each constructor
	MySet<Integer> emptySet = new MySet<>();
	MySet<Integer> arraySet = new MySet<>(arr);
	MySet<Integer> listSet = new MySet<>(list);
	MySet<String> strSet = new MySet<>(strArr);
	
	//creating MySet objects to use in testing difference, intersection and union methods
	MySet<Integer> difSet1 = new MySet<>(arr);
	MySet<Integer> difSet2 = new MySet<>(arr2);
	MySet<Integer> iSet1 = new MySet<>(arr);
	MySet<Integer> iSet2 = new MySet<>(arr2);
	
	//adding elements into the emptySet
	emptySet.add(2);
	emptySet.add(5);
	emptySet.add(8);
	emptySet.add(9);
	emptySet.add(9); //duplicate
	
	//displaying each set's content
	System.out.println("Set created using default constructor: ");
	System.out.println(emptySet);
	System.out.println("Set created using parameterized constructor (array): ");
	System.out.println(arraySet);
	System.out.println("Set created using parameterized constructor (list): ");
	System.out.println(listSet + "\n");
	
	//testing clear() and isEmpty() methods
	System.out.println("1. Testing clear() and isEmpty() methods:");
	System.out.println("\tBefore emptying set: Is set empty? " + emptySet.isEmpty());
	emptySet.clear();
	System.out.println("\tAfter emptying set: Is set empty? " + emptySet.isEmpty() + "\n");
	
	//testing contains() method
	System.out.println("2. Testing contains() method:");
	System.out.println("\tSet: " + arraySet);
	System.out.println("\tDoes set contain '2'? " + arraySet.contains(2));
	System.out.println("\tDoes set contain '56'? " + arraySet.contains(56) + "\n");
	
	//testing indexOf() method
	System.out.println("3. Testing indexOf() method:");
	System.out.println("\tSet: " + listSet);
	System.out.println("\tWhat is the index of '2'? " + listSet.indexOf(2));
	System.out.println("\tWhat is the index of '8'? " + listSet.indexOf(8));
	System.out.println("\tWhat is the index of '56'? " + listSet.indexOf(56) + "\n");
	
	//testing get() method
	try {
	    System.out.println("4. Testing get() method:");
	    System.out.println("\tSet: " + listSet);
	    System.out.println("\tWhat element is at index 0? " + listSet.get(0));
	    System.out.println("\tWhat element is at index 2? " + listSet.get(2));
	    System.out.print("\tWhat element is at index -1? ");
	    System.out.println(listSet.get(-1) + "\n");
	} 
	catch(IndexOutOfBoundsException e){System.out.print(e.getMessage() + "\n");} //catching indexoutofboundsexception
	
	//skipping a line
	System.out.println();
	
	//testing set() method
	try {
	    System.out.println("5. Testing set() method:");
	    System.out.println("\tSet: " + arraySet + "\n");
	    System.out.println("\tModifying element at index 0 from '2' to '4'");
	    arraySet.set(4, 0);
	    System.out.println("\tSet after modification: " + arraySet + "\n");
	    //trying to modify an element to something that is already in the set
	    System.out.println("\tModifying element at index 1 from '5' to '4'");
	    arraySet.set(4, 1);
	    System.out.println("\tSet after modification: " + arraySet + "\n");
	    //trying to modify an element to the same value
	    System.out.println("\tModifying element at index 1 from '5' to '5'");
	    arraySet.set(5, 1);
	    System.out.println("\tSet after modification: " + arraySet + "\n");
	    //trying to modify an invalid index
	    System.out.println("\tModifying element at index 25 to '25'");
	    arraySet.set(25, 25);
	    System.out.println("\tSet after modification: " + arraySet + "\n");
	}
	catch(IndexOutOfBoundsException e){System.out.print("\t" + e.getMessage() + "\n");} //catching indexoutofboundsexception
	
	//skipping a line
	System.out.println();
	
	//testing size method
	System.out.println("6. Testing size() method:");
	System.out.println("\tSet: " + listSet + "  Size: " + listSet.size());
	System.out.println("\tRemoving the last element from the set:");
	listSet.remove(listSet.size() - 1);
	System.out.println("\tSet after removal: " + listSet + "  Size: " + listSet.size() + "\n");
	
	//testing add method
	System.out.println("7. Testing add(index, object) method:");
	System.out.println("\tSet: " + arraySet);
	System.out.println("\tAdding an element (86) at beginning of the set:");
	arraySet.add(0, 86);
	System.out.println("\tSet after adding: " + arraySet + "\n");
	System.out.println("\tAdding an element (34) at end of the set:");
	arraySet.add(arraySet.size(), 34);
	System.out.println("\tSet after adding: " + arraySet+ "\n");
	System.out.println("\tAdding an element (108) at middle of the set:");
	arraySet.add((int)arraySet.size()/2, 108);
	System.out.println("\tSet after adding: " + arraySet+ "\n");
	System.out.println("\tAdding an element (108) that already exists");
	arraySet.add(0, 108);
	System.out.println("\tSet after adding: " + arraySet+ "\n");
	System.out.println("\tAdding an element (76) at negative index");
	arraySet.add(-5, 76);
	System.out.println("\tSet after adding: " + arraySet+ "\n");
	System.out.println("\tAdding an element (54) at index > size");
	arraySet.add(arraySet.size() + 24, 54);
	System.out.println("\tSet after adding: " + arraySet+ "\n");
	
	//testing remove method
	System.out.println("8. Testing remove(index) method:");
	System.out.println("\tSet: " + arraySet + "\n");
	System.out.println("\tRemoving an element at beginning of the set:");
	arraySet.remove(0);
	System.out.println("\tSet after removal: " + arraySet + "\n");
	System.out.println("\tRemoving an element at end of the set:");
	arraySet.remove(arraySet.size() - 1);
	System.out.println("\tSet after removal: " + arraySet+ "\n");
	System.out.println("\tRemoving an element at middle of the set:");
	arraySet.remove((int)arraySet.size()/2);
	System.out.println("\tSet after removal: " + arraySet+ "\n");
	System.out.println("\tRemoving an element at negative index");
	try {arraySet.remove(-5);} 
	catch (IndexOutOfBoundsException e) {System.out.print("\t" + e.getMessage() + "\n");}
	System.out.println("\tSet after removal: " + arraySet + "\n");
	System.out.println("\tRemoving an element at index > size");
	try {arraySet.remove(arraySet.size() + 24);} 
	catch (IndexOutOfBoundsException e) {System.out.print("\t" + e.getMessage() + "\n");}
	System.out.println("\tSet after removal: " + arraySet+ "\n");
	
	//testing add(element) method
	System.out.println("9. Testing add(element) method:");
	System.out.println("\tSet: " + listSet + "\n");
	System.out.println("\tAdding an element (86), " + "Added: " + listSet.add(86));
	System.out.println("\tSet after adding: " + listSet + "\n");
	System.out.println("\tAdding an element (5) that already exists, " + "Added: " + listSet.add(5));
	System.out.println("\tSet after adding: " + listSet + "\n");
	
	//testing remove(element) method
	System.out.println("10. Testing remove(element) method:");
	System.out.println("\tSet: " + strSet + "\n");
	System.out.println("\tRemoving an element (Hello), " + "Removed: " + strSet.remove("Hello"));
	System.out.println("\tSet after removal: " + strSet + "\n");
	System.out.println("\tRemoving an element (Test56) that doesn't exist exists, " + "Removed: " + strSet.remove("Test56"));
	System.out.println("\tSet after adding: " + strSet + "\n");
	
	//testing union method
	System.out.println("11. Testing union() method:");
	System.out.println("\tSet1: " + arraySet);
	System.out.println("\tSet2: " + listSet);
	System.out.println("\tSet1 after union: " + arraySet.union(listSet));
	System.out.println("\tSet2 after union: " + listSet + "\n");
	
	//testing intersection method
	System.out.println("12. Testing intersection() method:");
	System.out.println("\tSet1: " + iSet1);
	System.out.println("\tSet2: " + iSet2);
	System.out.println("\tSet1 after intersection: " + iSet1.intersection(iSet2));
	System.out.println("\tSet2 after intersection: " + iSet2 + "\n");
	
	//testing intersection method
	System.out.println("13. Testing difference() method:");
	System.out.println("\tSet1: " + difSet1);
	System.out.println("\tSet2: " + difSet2);
	System.out.println("\tSet1 after difference: " + difSet1.difference(difSet2));
	System.out.println("\tSet2 after difference: " + difSet2 + "\n");
    }
}