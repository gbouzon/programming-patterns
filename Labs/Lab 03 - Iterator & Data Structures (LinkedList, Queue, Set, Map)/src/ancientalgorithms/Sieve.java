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
 
package ancientalgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


/**
* Class based on Programming Patterns' lab 3 Q1, 2 (Ancient Algorithms).
* @author Giuliana Bouzon
*/
public class Sieve {
    
    public static void addNumbers(ArrayList<Integer> nums, int min, int max) {
	for (int i = min; i <= max; i++)
	    nums.add(i);
    }

    public static void main(String[] args) {
	ArrayList<Integer> nums = new ArrayList<>();
	addNumbers(nums, 2, 100); //starting at 2, ending at 100
	System.out.println(nums);

	
	for (int i = 0; i < nums.size(); i++) {
	    Iterator<Integer> iterator = nums.listIterator(i + 1);
	    int denominator = nums.get(i);
	    while (iterator.hasNext()) {
		int numerator = iterator.next();
		if (numerator % denominator == 0)
		    iterator.remove();
	    }
	}
        System.out.println(nums);
    }
}
