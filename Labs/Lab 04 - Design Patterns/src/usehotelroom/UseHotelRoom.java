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

import java.util.ArrayList;
import java.util.Arrays;

/**
 * An application class to demonstrate HotelRoom and Suite classes.
 * @author Giuliana Bouzon
 */
public class UseHotelRoom {
    
    /**
     * Creates a string of an array's toString()
     * @param objs, the Object array
     * @return the string containing the information of the objects in the array.
     */
     public static String toString(Object[] objs) {
	String str = "";
	for (Object obj : objs) 
	    str += obj.toString() + "\n";
	
	return str;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creating HotelRoom objects
        HotelRoom room1 = new HotelRoom(299);
        HotelRoom room2 = new HotelRoom(180);
        HotelRoom room3 = new HotelRoom(400);
        
        //creating Suite objects
        Suite suite1 = Suite.getInstance(610);
        Suite suite2 = Suite.getInstance(100);
        Suite suite3 = Suite.getInstance(299);
        
        //creating array
        HotelRoom[] hotelRoomArray = {room1, room2, suite1, suite2, suite3};
        
        //displaying array data
        System.out.println("Array data: ");
        System.out.println(toString(hotelRoomArray));
        
        //creating arrayList from array
        ArrayList<HotelRoom> hotelRoomList = new ArrayList<>(Arrays.asList(hotelRoomArray));
 
        
        //displaying data in the list
        System.out.println("Array list data: ");
        System.out.println(hotelRoomList.toString());   
    }
}
