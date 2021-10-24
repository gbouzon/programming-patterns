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

package collectionreview;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/**
*
* @author Giuliana Bouzon
*/
public class ErrorE {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	//FIND ERRORS EXERCISE
	
	//1. 
	//List<String> nameList = new LinkedHashSet<>();
	Set<String> nameList = new LinkedHashSet<>();
	
	//2.
	//List<String> nameList = new ArrayList<>();
	//ListIterator it = new ListIterator(nameList);
	List<String> nameList2 = new ArrayList<>();
	ListIterator<String> it = nameList2.listIterator();
	
	//3 - list iterators are used for lists not for sets
	//Set<String> nameSet = new HashSet<>();
	//nameSet.add("Harold");
	//nameSet.add("Semi-colon");
	//ListIterator it = nameSet.listIterator();
	
	//4 - can't sort a hashset, use a treeset instead
	//Set<String> nameSet = new HashSet<>();
	//nameSet.add("Harold");
	//nameSet.add("Semi-colon");
	//Collections.sort(nameSet);
	
	//5 - listIterator should not be capitalized
	//List<String> nameList = new ArrayList<>();
	//ListIterator<E> it = nameList.ListIterator();
	//it.set("Henry");
	
	List<String> nameList3 = new ArrayList<>();
	ListIterator<String> iterator = nameList3.listIterator();
	it.set("Hwney"); //list is empty
    }
}
