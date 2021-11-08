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

import java.util.Objects;

/**
*
* @author Giuliana Bouzon
*/
public class Stock {
    
    //properties
    private int stockNumber;
    private Data data;
    
    //default constructor
    public Stock() {
	this(0, new Data());
    }
    
    //parameterized constructor
    public Stock(int stockNumber, Data data) {
	this.stockNumber = (stockNumber >= 0) ? stockNumber : 0;
	this.data = (data != null) ? new Data(data) : new Data();
    }
    
    //copy constructor
    public Stock(Stock stock) {
	this(stock.stockNumber, stock.data);
    }

    @Override
    public int hashCode() {
	return Objects.hash(data, stockNumber);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Stock other = (Stock) obj;
	return Objects.equals(data, other.data) && stockNumber == other.stockNumber;
    }
    
    @Override
    public String toString() {
	return String.format("Stock Number: %d, %s", this.stockNumber, this.data.toString());
    }
    
    //getters and setters
    
    public int getStockNumber() {
	return this.stockNumber;
    }
    
    public void setStockNumber(int stockNumber) {
	if (stockNumber >= 0)
	    this.stockNumber = stockNumber;
    }
    
    public Data getData() {
	return new Data(this.data); //deep copy
    }
    
    public void setData(Data data) {
	if (data != null)
	    this.data = new Data(data);
    }
}
