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

package vehicle;

/**
 * A simple Vehicle class defining Vehicle class.
 * @author Giuliana Bouzon
 */
public abstract class Vehicle {
   
    //properties
    private int noOfWheels;
    private double avgMilesPerGallon;
    
    //parameterized constructor
    public Vehicle(int noOfWheels, double avgMilesPerGallon) {
        this.noOfWheels = noOfWheels;
        this.avgMilesPerGallon = avgMilesPerGallon;
    }
    
    //getters and setters

    public int getNoOfWheels() {
        return this.noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        if (noOfWheels >= 0)
        this.noOfWheels = noOfWheels;
    }

    public double getAvgMilesPerGallon() {
        return avgMilesPerGallon;
    }

    public void setAvgMilesPerGallon(double avgMilesPerGallon) {
        if (avgMilesPerGallon >= 0)
        this.avgMilesPerGallon = avgMilesPerGallon;
    }

    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-15s: %d \n", "Number of Wheels", this.noOfWheels);
        str += String.format("%-15s: %.2f \n", "Average Miles per Gallon", this.avgMilesPerGallon);
        
        return str;
    }  
}
