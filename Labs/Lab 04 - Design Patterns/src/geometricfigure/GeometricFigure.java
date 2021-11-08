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

package geometricfigure;

import java.util.Objects;

/**
* Using Strategy pattern.
* @author Giuliana Bouzon
*/
public abstract class GeometricFigure {
    
    //properties
    private int width;
    private int height;
    private double area;
    
    //default constructor
    public GeometricFigure() {
	this(0, 0);
    }
    
    //parameterized constructor
    public GeometricFigure(int width, int height) {
	this.width = (width >= 0) ? width : 0;
	this.height = (height >= 0) ? height : 0;
	this.area = computeArea(width, height);
    }
    
    //copy constructor
    public GeometricFigure(GeometricFigure figure) {
	this(figure.width, figure.height);
    }
    
    //abstract method to be implemented in child classes
    public abstract double computeArea(int width, int height);

    @Override
    public int hashCode() {
	return Objects.hash(area, height, width);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	GeometricFigure other = (GeometricFigure) obj;
	return Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area) && height == other.height
		&& width == other.width;
    }

    @Override
    public String toString() {
	String str = "";
	
	str += String.format("%-10s: %d\n", "Width", this.width);
	str += String.format("%-10s: %d\n", "Height", this.height);
	str += String.format("%-10s: %.2f\n", "Area", this.area);
	
	return str;
    }

    //getters and setters
    
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
	if (width > 0)
	    this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
	if (height > 0)
	    this.height = height;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
	if (area > 0)
	    this.area = area;
    }    
}