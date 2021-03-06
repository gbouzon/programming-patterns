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

package usehotelroom;

/**
 * A simple Suite class defining Suite objects, child class of HotelRoom.
 * Implementing Singleton Pattern
 * @author Giuliana Bouzon
 */
public class Suite extends HotelRoom {
    
    private static Suite suite;
    
    //constructor
    private Suite(int roomNumber) {
        super(roomNumber);
        this.rentalRate += 40;
    }
    
    //to be used when instantiating object
    public static Suite getInstance(int roomNumber) {
	if (suite == null)
	    suite = new Suite(roomNumber);
	return suite;
    }

    @Override
    public String toString() {
        return "Suite: " + super.toString();
    }  
}
