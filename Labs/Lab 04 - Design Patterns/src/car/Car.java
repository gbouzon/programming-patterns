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
public class Car {
    
    //properties
    private int yearModel;
    private String make;
    private int speed;
    
    //constructor
    public Car(int yearModel, String make) {
	this.yearModel = yearModel;
	this.make = make;
	this.speed = 0;
    }
    
    public void accelerate() {
	this.speed += 5;
    }
    
    public void brake() {
	if (this.speed - 5 >= 0)
	    this.speed -= 5;
    }
    
    @Override
    public String toString() {
	String str = "";
	str += String.format("%-10s: %d\n", "Model Year", this.yearModel);
	str += String.format("%-10s: %s\n", "Maker", this.make);
	str += String.format("%-10s: %d\n", "Speed", this.speed);
	return str;
    }
    
    //getters and setters 
    
    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}