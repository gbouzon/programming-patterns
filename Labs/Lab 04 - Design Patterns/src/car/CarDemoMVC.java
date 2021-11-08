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

package car;

/**
*
* @author Giuliana Bouzon
*/
public class CarDemoMVC {
    
    private static Car retrieveCar(int yearModel, String make) {
	return new Car(yearModel, make);
    }

    public static void main(String[] args) {
	Car car = retrieveCar(2021, "Toyota");
	CarView view = new CarView();
	CarController controller = new CarController(car, view);
	//everything from this on has to be done using the controller
	
	controller.updateView();
	
	for (int i = 0; i < 5; i++) {
	    controller.accelerate();
	    controller.updateView();

	}

	for (int i = 0; i <= 5; i++) {
	    controller.brake();
	    controller.updateView();
	}
    }

}
