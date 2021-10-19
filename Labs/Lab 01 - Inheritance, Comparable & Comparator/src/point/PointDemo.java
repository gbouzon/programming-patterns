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

package lab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/**
* A simple application class to demonstrate Point and ComparePoint (Comparable/Comparator lab)
* @author Giuliana Bouzon
*/
public class PointDemo {

    public static void main(String[] args) {
	
	//creating Point array
	Point[] pointArray = {new Point(2, 3), new Point(0, 0), new Point(12, 12), 
		new Point(0, 32), new Point(2, 40)};
	
	//ascending order of x
	System.out.println("Printing points array in ascending order of x-coordinate:");
	Arrays.sort(pointArray);
	System.out.println(Arrays.toString(pointArray) + "\n");
	
	//ascending order of y
	System.out.println("Printing points array in ascending order of y-coordinate:");
	Arrays.sort(pointArray, new ComparePoint());
	System.out.println(Arrays.toString(pointArray) + "\n");

	//creating Point arraylist from array
	ArrayList<Point> points = new ArrayList<>(Arrays.asList(pointArray));
	
	//ascending order of x
	System.out.println("Printing points list in ascending order of x-coordinate:");
	Collections.sort(points);
	System.out.println(points + "\n");
	
	//ascending order of y
	System.out.println("Printing points list in ascending order of y-coordinate:");
	Collections.sort(points, new ComparePoint());
	System.out.println(points);
	
	//DOING IT WITH STREAMS and LAMBDA EXPRESSION
	//advantage of doing it like this is that we don't need to create a separate Comparator class
	Collections.sort(points, (Point o1, Point o2) -> (o1.getY() != o2.getY()) ? (o1.getY() - o2.getY()) : (o1.getX() - o2.getX()));
    }
}
