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

package property;

/**
* A Vehicle class defining Vehicle objects.
* Answers questions from Part1 of assignment0.docx
* @author Giuliana Bouzon
*/
public class Vehicle {
    
    //properties
    protected int registrationNumber;
    protected double maxVelocity;
    protected double value;
    
    //parameterized(3) constructor
    public Vehicle(int registrationNumber, double maxVelocity, double value) {
	this.registrationNumber = registrationNumber; 
	this.maxVelocity = (maxVelocity >= 0) ? maxVelocity : 0; 
	this.value = (value >= 0) ? value : 0;
    }

    @Override
    public String toString() {
	String str = "";
	
	str += String.format("%-15s: %d \n", "Registration Number", this.registrationNumber);
	str += String.format("%-15s: %.2f \n", "Max Velocity", this.maxVelocity);
	str += String.format("%-15s: $%.2f \n", "Value", this.value);
	
	return str;
    }
    
    //getters and setters
    
    public int getRegistrationNumber() {
	return this.registrationNumber;
    }
    
    public void setRegistrationNumber(int registrationNumber) {
	this.registrationNumber = registrationNumber;
    }
    
    public double getMaxVelocity() {
	return this.maxVelocity;
    }
    
    public void setMaxVelocity(double maxVelocity) {
	if (maxVelocity >= 0)
	    this.maxVelocity = maxVelocity;
    }
    
    public double getValue() {
	return this.value;
    }
    
    public void setValue(double value) {
	if (value > 0)
	    this.value = value;
    }  
}