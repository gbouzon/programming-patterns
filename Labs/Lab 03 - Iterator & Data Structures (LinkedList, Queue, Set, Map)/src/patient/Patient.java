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

package patient;

/**
* A simple Patient class defining Patient objects.
* Class based on Programming Patterns' lab 03, Q2 (Data Structures - Priority Queue).
* @author Giuliana Bouzon
*/
public class Patient {
    
    //properties
    private int idNumber;
    private String name;
    private boolean emergencyCase;
    
    //default constructor
    public Patient() {
	this(0, "noName", false);
    }
    
    //parameterized constructor
    public Patient(int idNumber, String name, boolean emergencyCase) {
	this.idNumber = (idNumber > 0) ? idNumber : 0;
	this.name = (name != null && !name.isEmpty()) ? name : "noName";
	this.emergencyCase = emergencyCase;
    }
    
    @Override
    public String toString() {
	return String.format("%s", this.name);
    }

    //getters and setters
    
    public int getIdNumber() {
	return this.idNumber;
    }
    
    public void setIdNumber(int idNumber) {
	if (idNumber > 0)
	    this.idNumber = idNumber;
    }
    
    public String getName() {
	return this.name;
    }
    
    public void setName(String name) {
	if (name != null && !name.isEmpty())
	    this.name = name;
    }
    
    public boolean isEmergencyCase() {
	return this.emergencyCase;
    }
    
    public void setEmergencyCase(boolean emergencyCase) {
	this.emergencyCase = emergencyCase;
    }
}