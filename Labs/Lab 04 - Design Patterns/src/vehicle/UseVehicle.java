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
 * A simple application class to demonstrate Vehicle, Car and Motorcycle classes.
 * @author Giuliana Bouzon
 */
public class UseVehicle {
    
    public static void main(String[] args) throws Exception {
        Vehicle vehicle1 = new Car(12.85);
        Vehicle vehicle2 = new Motorcycle(4.85);
        
        //vehicle3 and vehicle4 are equal
        Vehicle vehicle3 = TrackTrailer.getInstance(15);
        Vehicle vehicle4 = TrackTrailer.getInstance(15);
        
        System.out.println(vehicle1);
        System.out.println(vehicle2);
        System.out.println(vehicle3);
        System.out.println(vehicle4);
        
        //using factory pattern: abstraction
        vehicle1 = FactoryVehicle.createVehicle("Car", 4);
        vehicle1 = FactoryVehicle.createVehicle("Motorcycle", 12.85);
        vehicle1 = FactoryVehicle.createVehicle("TrackTrailer", 12.85);
        
        System.out.println(vehicle1);
        System.out.println(vehicle2);
        System.out.println(vehicle3);
    }  
}