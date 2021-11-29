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

import java.util.Objects;

/**
*
* @author Giuliana Bouzon
*/
public class Student {
    
    //properties
    private int studentId;
    private String name;
    private String address;
    
    //default constructor
    public Student() {
	this(0, "noName", "noAddress");
    }
    
    //parameterized constructor
    public Student(int studentId, String name, String address) {
	this.studentId = (studentId > 0) ? studentId : 0;
	this.name = (name != null && !name.isEmpty()) ? name : "noName";
	this.address = (address != null && !address.isEmpty()) ? address : "noAddress";
    }
    
    //copy constructor
    public Student(Student student) {
	this(student.studentId, student.name, student.address);
    }

    @Override
    public int hashCode() {
	return Objects.hash(address, name, studentId);
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
	return Objects.equals(address, other.address) && Objects.equals(name, other.name)
		&& studentId == other.studentId;
    }

    @Override
    public String toString() {
	return String.format("Student with id '%d': %s lives at %s", this.studentId, this.name, this.address);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
	if (studentId > 0)
	    this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
	if (name != null && !name.isEmpty())
	    this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
	if (address != null && !address.isEmpty())
	    this.address = address;
    }
}