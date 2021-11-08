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

package company;

import java.util.Objects;

/**
*
* @author Giuliana Bouzon
*/
public class DomesticDivision extends Division {
    
    //properties
    private String state;
    
    //default constructor
    public DomesticDivision() {
	this("noName", 0, "noState");
    }
    
    //parameterized constructor
    public DomesticDivision(String name, int accountNumber, String state) {
	super(name, accountNumber);
	this.state = (state != null && !state.isEmpty()) ? state : "noState";
    }
    
    //copy constructor
    public DomesticDivision(DomesticDivision division) {
	this(division.name, division.accountNumber, division.state);
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + Objects.hash(state);
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (!super.equals(obj))
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	DomesticDivision other = (DomesticDivision) obj;
	return Objects.equals(state, other.state);
    }
    
    @Override
    public String toString() {
	String str = "";
	
	str += "Domestic Division\n";
	str += super.toString();
	str += String.format("%-10s: %s\n", "State", this.state);
	
	return str;
    }
    
    //getters and setters
    
    public String getState() {
	return this.state;
    }
    
    public void setState(String state) {
	if (state != null && !state.isEmpty())
	    this.state = state;
    }
}