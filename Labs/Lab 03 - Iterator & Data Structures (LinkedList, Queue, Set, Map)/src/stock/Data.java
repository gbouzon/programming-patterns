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

package stock;

import java.util.Objects;

/**
*
* @author Giuliana Bouzon
*/
public class Data {
    
    //properties
    private String name;
    private double quantity;
    
    //default constructor
    public Data() {
	this("noName", 0);
    }
    
    //parameterized constructor
    public Data(String name, double quantity) {
	this.name = (name != null && !name.isEmpty()) ? name : "noName";
	this.quantity = (quantity >= 0) ? quantity : 0;
    }
    
    //copy constructor
    public Data(Data data) {
	this(data.name, data.quantity);
    }
    
    @Override
    public int hashCode() {
	return Objects.hash(name, quantity);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Data other = (Data) obj;
	return Objects.equals(name, other.name)
		&& Double.doubleToLongBits(quantity) == Double.doubleToLongBits(other.quantity);
    }

    @Override
    public String toString() {
	return String.format("%s: %.2f", this.name, this.quantity);
    }
    
    //getters and setters
    
    public String getName() {
	return this.name;
    }
    
    public void setName(String name) {
	if (name != null && !name.isEmpty())
	    this.name = name;
    }
    
    public double getQuantity() {
	return this.quantity;
    }
    
    public void setQuantity(double quantity) {
	if (quantity >= 0)
	    this.quantity = quantity;
    }
}