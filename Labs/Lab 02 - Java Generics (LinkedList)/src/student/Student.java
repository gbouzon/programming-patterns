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

/**
* A simple Student class defining Student objects.
* Class based on Programming Patterns' lab 2 (Java Generics - MyLinkedList).
* @author Giuliana Bouzon
*/
public abstract class Student {
    
    //properties
    protected String studentId;
    protected String name;
    protected double registrationFees;
    
    //parameterized(2) constructor
    public Student(String studentId, String name) {
	this.studentId = (studentId != null && !studentId.isEmpty()) ? studentId : "noStudentId";
	this.name = (name != null && !name.isEmpty()) ? name : "noName";
    }
    
    /**
     * Sets the registration fee to the specified value (check implementation in child classes).
     */
    public abstract void setFees();
    
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	long temp;
	temp = Double.doubleToLongBits(registrationFees);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((studentId == null) ? 0 : studentId.hashCode());
	return result;
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
	if (name == null) {
	    if (other.name != null)
		return false;
	} else if (!name.equals(other.name))
	    return false;
	if (Double.doubleToLongBits(registrationFees) != Double.doubleToLongBits(other.registrationFees))
	    return false;
	if (studentId == null) {
	    if (other.studentId != null)
		return false;
	} else if (!studentId.equals(other.studentId))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	String str = "";
	
	str += String.format("%-20s: %s \n", "Student ID", this.studentId);
	str += String.format("%-20s: %s \n", "Name", this.name);
	str += String.format("%-20s: $%.2f \n", "Registration Fees", this.registrationFees);
	
	return str;	
    }
    
    //getters and setters
    
    public String getStudentId() {
	return this.studentId;
    }
    
    public void setStudentId(String studentId) {
	if (studentId != null && !studentId.isEmpty())
	    this.studentId = studentId;
    }
    
    public String getName() {
	return this.name;
    }
    
    public void setName(String name) {
	if (name != null && !name.isEmpty())
	    this.name = name;
    }
    
    public double getRegistrationFees() {
	return this.registrationFees;
    }
}