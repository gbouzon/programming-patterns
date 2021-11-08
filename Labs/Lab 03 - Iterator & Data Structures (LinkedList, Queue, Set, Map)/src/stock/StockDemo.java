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

package stock;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
*
* @author Giuliana Bouzon
*/
public class StockDemo {
    
    //class variables
    static Scanner scanner = new Scanner(System.in);
    static String numberRegex = "^[0-9]+$";
    
    /**
     * Prompts the user to enter a *valid* stock number
     * @return ^
     */
    public static int retrieveStockNumber() {
	String number = "";
	do {
	    System.out.print("Please enter stock number: ");
	    number = scanner.next();
	} while (!Pattern.matches(numberRegex, number));
	
	return Integer.parseInt(number);
    }

    public static void main(String[] args) {
	//creating map
	Map<Integer, Data> map = new HashMap<>();
	
	//creating stock objects
	Stock stock1 = new Stock(1001, new Data("NYSE:A", 1234.5));
	Stock stock2 = new Stock(1002, new Data("NYSE:NEW", 1424.3));
	Stock stock3 = new Stock(1003, new Data("NYSE:X", 234242343.5));
	Stock stock4 = new Stock(1004, new Data("NASDAQ:MSFT", 234.45));
	Stock stock5 = new Stock(1005, new Data("NASDAQ:AMZN", 2904372.1));

	//populating map
	map.put(stock1.getStockNumber(), stock1.getData());
	map.put(stock2.getStockNumber(), stock2.getData());
	map.put(stock3.getStockNumber(), stock3.getData());
	map.put(stock4.getStockNumber(), stock4.getData());
	map.put(stock5.getStockNumber(), stock5.getData());

	int stockNumber = retrieveStockNumber();
	boolean isFound = false;
	
	for (Map.Entry<Integer, Data> entry : map.entrySet()) {
	    if (entry.getKey().equals(stockNumber)) {
		System.out.println("Stock for stock number \'" + stockNumber + "\': " + entry.getValue());
		isFound = true;
	    }
	}
	if (!isFound)
	    System.out.println("Stock for stock number \'" + stockNumber + "\' not found.");

    }

}
