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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
* Application class for Student.
* ORIGINALLY, student class was supposed to have string course and then in the main you make an arraylist
* but I'm too lazy to change it. :)
* @author Giuliana Bouzon
*/
public class StudentDemo {

    public static void main(String[] args) {
	//creating hashmap
	HashMap<Integer, ArrayList<String>> students = new HashMap<>();
	
	//creating student objects
	Student s1 = new Student(1, new ArrayList<String>(
		Arrays.asList(new String[]{"CS100", "CS105", "MATH210"})));
	Student s2 = new Student(2, new ArrayList<String>(
		Arrays.asList(new String[]{"CS200","CS210", "CS230"})));
	Student s3 = new Student(2, new ArrayList<String>(
		Arrays.asList(new String[]{"CS300","CS310", "CS330"})));
	
	//populating map
	students.put(s2.getStudentId(), s2.getCourses());
	students.put(s3.getStudentId(), s3.getCourses());
	students.put(s1.getStudentId(), s1.getCourses());

	//displaying map
	System.out.println("Unsorted Map");
	for (Map.Entry<Integer, ArrayList<String>> entry : students.entrySet()) {
	    System.out.print(entry.getKey() + " " + entry.getValue() + ", ");
	}
	
	//skipping a line
	System.out.println();
	
	//creating treemap to sort keys
	TreeMap<Integer, ArrayList<String>> studentsSorted = new TreeMap<>(students);
	
	//displaying map
	System.out.println("Sorted Map");
	for (Map.Entry<Integer, ArrayList<String>> entry : studentsSorted.entrySet()) {
	    System.out.print(entry.getKey() + " " + entry.getValue() + ", ");
	}
    }
}