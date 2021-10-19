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

package point;

/**
* A Point class defining point objects.
* @author Giuliana Bouzon
*/
public class Point implements Comparable<Point> {
    
    //properties
    private int x;
    private int y;
    
    //default constructor
    public Point() {
	this(0, 0);
    }
    
    //parameterized constructor
    public Point(int x, int y) {
	this.x = x;
	this.y = y;
    }
    
    //copy constructor
    public Point(Point point) {
	this(point.x, point.y);
    }

    @Override
    public int compareTo(Point o) {
	return (this.x != o.x) ? (this.x - o.x) : (this.y - o.y);
    }

    @Override
    public String toString() {
	return String.format("Point: (%d, %d)", this.x, this.y);
    }
    
    
    //getters and setters
    
    public int getX() {
	return this.x;
    }
    
    public void setX(int x) {
	this.x = x;
    }
    
    public int getY() {
	return this.y;
    }
    
    public void setY(int y) {
	this.y = y;
    }
}
