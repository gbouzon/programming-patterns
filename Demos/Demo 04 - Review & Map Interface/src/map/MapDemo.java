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

package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
*
* @author Giuliana Bouzon
*/
public class MapDemo {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	//keys MUST be unique: do this using equals() and hashCode()
	//when we're using a wrapping class we don't need to worry about this
	//but with user-defined classes, always implement equals() and hashCode() to keep map keys unique
	Map<String,Integer> hashMap1 = new HashMap();
        hashMap1.put("Smith",30);
        hashMap1.put("Anderson",31);
        hashMap1.put("Lewis",29);
        hashMap1.put("Cook",29);
        hashMap1.put("Smith",40);
        //when we add duplicate keys, java overrides the first one. Only the last value is kept.
        System.out.println("Entries in hashMap1");
        //there is no order to hashmaps, all it does is make sure that keys are unique
        System.out.println(hashMap1 +"\n");
        
        //treemaps are used to sort maps just like treeset are used to sort sets
        //different constructors allow us to create treemaps from different kinds of maps
        //uses comparable interface implemented by String class (alphabetically sorted)
        //if we're using a user-defined object as a key, make sure to implement comparable or comparator
        Map<String,Integer> sortedMap = new TreeMap<>(hashMap1);
        System.out.println("Entries in treeMap");
        System.out.println(sortedMap +"\n");
        
        //because hashmaps are not ordered in any way, we have linkedhashmaps that are ordered hashmaps
        //2 types of order for linkedhashmaps: access order or insertion order
        //constructor has a boolean property that if set to true, makes it access-ordered, check below
        //if set to false, makes it insertion-ordered
        //load factor specifies when the capacity of the map should be doubled (in this case, when it reaches 75%)
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith",30);
        linkedHashMap.put("Anderson",31);
        linkedHashMap.put("Lewis",29);
        linkedHashMap.put("Cook",29);
        
        System.out.println("The age for Lewis is "+ linkedHashMap.get("Lewis"));
        System.out.println("Entries in linkedHashMap");
        System.out.println(linkedHashMap +"\n");
        //since access order is true, the map's order will be:
        //Smith Anderson Cook Lewis
    }
}
