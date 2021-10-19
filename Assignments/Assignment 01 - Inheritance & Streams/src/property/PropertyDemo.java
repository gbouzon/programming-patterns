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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import interfaces.ITaxable;

/**
* A simple application class to test Property classes.
* Answers questions from Part1 of assignment0.docx
* @author Giuliana Bouzon
*/
public class PropertyDemo {

    public static void main(String[] args) {

	//creating array of taxable properties (bus and house)
	ITaxable[] tProperties = {new TaxableHouse("Someplace", true, 1000000, 1000), 
		new TaxableHouse("Someplace else", true, 700000, 467), 
		new TaxableHouse("Someplace else else", false, 1000000, 750), 
		new TaxableBus(00001, 100, 67, 55), new TaxableBus(00002, 200, 20, 55), 
		new TaxableBus(00003, 100, 67, 55)};
	
	//creating arrayList of ITaxable objects
	ArrayList<ITaxable> list = new ArrayList<>(Arrays.asList(tProperties));
	
	//sorting the list using lambda expression
	Collections.sort(list, (ITaxable o1, ITaxable o2) -> Double.compare(o1.valueTax(), o2.valueTax()));

	//printing each property according to its type
	for (ITaxable taxableProperty : tProperties) {
	    if (taxableProperty instanceof FixedProperty)
		System.out.println("House:");
	    else
		System.out.println("Bus:");
	    
	    System.out.println(taxableProperty);
	}	
    }
}