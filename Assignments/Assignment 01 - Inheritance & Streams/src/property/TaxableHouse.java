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

import interfaces.ITaxable;

/**
* A TaxableHouse class defining TaxableHouse objects.
* Answers questions from Part1 of assignment0.docx
* @author Giuliana Bouzon
*/
public class TaxableHouse extends House implements ITaxable {

    //parameterized constructor
    public TaxableHouse(String location, boolean inCity, double estimatedValue, double area) {
	super(location, inCity, estimatedValue, area);
    }

    @Override
    public double valueTax() { 
	return (this.isInCity() ? ((this.getEstimatedValue() / 1000) * 5 + 5 * this.getArea()) : 
	    (this.getEstimatedValue() / 1000) * 3);
    }
    
    @Override
    public String toString() {
	return super.toString() + String.format("%-15s: %.2f \n", "Tax", this.valueTax());
    }
}