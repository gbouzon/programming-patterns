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
public class Division {
    
    //properties
    protected String name;
    protected int accountNumber;
    
    //default constructor
    public Division() {
	this("noName", 0);
    }
    
    //parameterized constructor
    public Division(String name, int accountNumber) {
	this.name = (name != null && !name.isEmpty()) ? name : "noName";
	this.accountNumber = (accountNumber >= 0) ? accountNumber : 0;
    }
    
    //copy constructor
    public Division(Division division) {
	this(division.name, division.accountNumber);
    }
    
    public void display() {
	System.out.println(this);
    }

    @Override
    public int hashCode() {
	return Objects.hash(accountNumber, name);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Division other = (Division) obj;
	return accountNumber == other.accountNumber && Objects.equals(name, other.name);
    }
    
    @Override
    public String toString() {
	return String.format("Division \'%s\': %d\n", this.name, this.accountNumber);
    }
    
    //getters and setters
    
    public String getName() {
	return this.name;
    }
    
    public void setName(String name) {
	if (name != null && !name.isEmpty())
	    this.name = name;
    }
    
    public int getAccountNumber() {
	return this.accountNumber;
    }
    
    public void setAccountNumber(int accountNumber) {
	if (accountNumber >= 0)
	    this.accountNumber = accountNumber;
    }
}
