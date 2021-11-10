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
import java.util.Objects;

/**
* Based on Lab 3, Q4, 2.
* @author Giuliana Bouzon
*/
public class Student implements Comparable<Student> {
    
    //properties
    private int studentId;
    private ArrayList<String> courses;
    
    //default constructor
    public Student() {
	this(0, new ArrayList<>());
    }

    //parameterized constructor
    public Student(int studentId, ArrayList<String> courses) {
	this.studentId = (studentId > 0) ? studentId : 0;
	this.courses = new ArrayList<String>(courses);
    }
    
    //copy constructor
    public Student(Student student) {
	this(student.studentId, student.courses);
    }
    
    @Override
    public int compareTo(Student o) {
	return this.studentId - o.studentId;
    }

    @Override
    public int hashCode() {
	return Objects.hash(courses, studentId);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Student other = (Student) obj;
	return Objects.equals(courses, other.courses) && studentId == other.studentId;
    }
    
    @Override
    public String toString() {
	return String.format("%d %s", this.studentId, this.courses.toString()); //based on output
    }
    
    //getters and setters
    
    public int getStudentId() {
	return this.studentId;
    }
    
    public void setStudentId(int studentId) {
	if (studentId > 0)
	    this.studentId = studentId;
    }
    
    public ArrayList<String> getCourses() {
	return new ArrayList<String>(courses);
    }
    
    public void setCourseId(ArrayList<String> courses) {
	if (courses != null && !courses.isEmpty())
	    this.courses = new ArrayList<String>(courses);
    }

}