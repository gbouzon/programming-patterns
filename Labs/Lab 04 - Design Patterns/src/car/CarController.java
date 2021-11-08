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
* Using MVC pattern (view, controller and object class itself)
* @author Giuliana Bouzon
*/
public class CarController {
    
    private Car car;
    private CarView view;
    
    public CarController(Car car, CarView view) {
	this.car = car;
	this.view = view;
    }
    
    public int getCarYearModel() {
	return car.getYearModel();
    }
    
    public String getCarMake() {
	return car.getMake();
    }
    
    public int getCarSpeed() {
	return car.getSpeed();
    }
    
    public void accelerate() {
	car.accelerate();
    }
    
    public void brake() {
	car.brake();
    }
    
    public void updateView() {
	view.printCarDetails(car);
    }
}