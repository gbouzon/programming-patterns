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

package horse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * A simple application class to demonstrate Horse and RaceHorse classes.
 * @author Giuliana Bouzon
 */
public class HorseDemo {
    
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
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        Horse[] array = {new Horse("Semi-colon", "Brown", 2000), new Horse("Radis", "Black", 2015),
        new RaceHorse("MoonBeam", "White", 2000, 5), new RaceHorse("Bartolo", "White", 1998, 10),
        new RaceHorse("Ladis", "Blue", 2014, 3)};
        
        Arrays.sort(array);
        System.out.println(toString(array));
        
        ArrayList<Horse> list = new ArrayList(Arrays.asList(array));
        
        //ascending order
        Collections.sort(list, new ComparingHorse());
        System.out.println(list.toString());
        
        //skipping line
        System.out.println();
        
        //descending order
        Collections.reverse(list);
        System.out.println(list.toString());
        
        //alternative way of doing it:
        //Collections.reverseOrder(new ComparingHorse());
        
        //using factoryhorse
        Horse horse1 = FactoryHorse.createHorse("Horse", "Semi-colon", "Brown", 2000, 0);
        Horse horse2 = FactoryHorse.createHorse("RaceHorse", "Semi-colon", "Brown", 2000, 5);
        
        System.out.println(horse1);
        System.out.println(horse2);
    }  
}
