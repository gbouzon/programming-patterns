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

/**
* Application class to test Geometric figures & factory pattern.
* @author Giuliana Bouzon
*/
public class GeometricFigureDemo {

    public static void main(String[] args) throws Exception {
	
	/*without factory pattern
	GeometricFigure rectangle = new Rectangle(4, 6);
	System.out.println(rectangle);
	
	GeometricFigure square1 = new Square(4, 6);
	System.out.println(square1);
	
	GeometricFigure square2 = new Square(6);
	System.out.println(square2);
	
	GeometricFigure triangle = new Triangle(4, 6);
	System.out.println(triangle);
	*/
	
	//using factory pattern
	GeometricFigure rectangle = FigureFactory.createFigure(1, 4, 6);
	GeometricFigure square = FigureFactory.createFigure(2, 4, 6);
	GeometricFigure triangle = FigureFactory.createFigure(3, 4, 6);
	
	System.out.println(rectangle);
	System.out.println(square);
	System.out.println(triangle);
    }
}