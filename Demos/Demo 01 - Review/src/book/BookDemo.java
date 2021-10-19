/** MIT License Copyright (c) 2021 Giuliana Bouzon
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package book;

import java.util.Arrays;

/**
 * A simple driver class to demo Book class objects.
 * @author Giuliana Bouzon
 */
public class BookDemo {
    
     /**
     * Creates a string of an array's toString()
     * @param objs, the Object array
     * @return the string containing the information of the objects in the array.
     */
     public static String toString(Object[] objs) {
	String str = "";
	for (Object obj : objs) 
	    str += obj.toString() + "\n";
	
	return str;
    }

    public static void main(String[] args) {

	//creating an array of books
        Book[] books = {new Book("Programming Patterns", "Daniel Liang"), new Book("Intro to Java Programming", "Daniel Liang"),
            new Book("Data Structures", "Tony Gaddis"), new Book("Random Book", "Random Author")};
        
        //sorting array
        Arrays.sort(books);
        
        //printing out array
        System.out.print(toString(books));
    }  
}
