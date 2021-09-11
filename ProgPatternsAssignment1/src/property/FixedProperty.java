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
* A FixedProperty class defining FixedProperty objects.
* Answers questions from Part1 of assignment0.docx
* @author Giuliana Bouzon
*/
public class FixedProperty {
    
    //properties
    private String location;
    private boolean inCity;
    private double estimatedValue;
    
    //parameterized(3) constructor
    public FixedProperty(String location, boolean inCity, double estimatedValue) {
	this.location = (location != null && !location.isEmpty()) ? location : "noLocation";
	this.inCity = inCity;
	this.estimatedValue = (estimatedValue >= 0) ? estimatedValue : 0;
	
    }
    
    //parameterized(1) constructor
    public FixedProperty(String location) {
	this(location, true, 1000000);
    }

    @Override
    public String toString() {
	String str = "";
	
	str += String.format("%-15s: %s \n", "Location", this.location);
	str += String.format("%-15s: %b \n", "In City", this.inCity);
	str += String.format("%-15s: $%.2f \n", "Estimated Value", this.estimatedValue);
	
	return str;
    }
    
    //getters and setters
    
    public String getLocation() {
	return this.location;
    }
    
    public void setLocation(String location) {
	if (location != null && location.isEmpty())
	    this.location = location;
    }
    
    public boolean isInCity() {
	return this.inCity;
    }
    
    public void setInCity(boolean inCity) {
	this.inCity = inCity;
    }
    
    public double getEstimatedValue() {
	return this.estimatedValue;
    }
    
    public void setEstimatedValue(double estimatedValue) {
	if (estimatedValue > 0)
	    this.estimatedValue = estimatedValue;
    }
}